package network;

import static java.lang.String.format;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class CommunicationBridge {

	private final Socket socket;
	private final TCPConnectionListener eventListener;
	private final BufferedWriter bufferedWriter;
	private Thread rxThread;

	public CommunicationBridge(TCPConnectionListener eventListener,
			String ipAddress, int port) throws IOException {
		this(eventListener, new Socket(ipAddress, port));
	}

	public CommunicationBridge(TCPConnectionListener eventListener,
			Socket socket) throws IOException {
		this.eventListener = eventListener;
		this.socket = socket;
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
		bufferedWriter = new BufferedWriter(
				new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
		rxThread = new Thread(() -> {
			try {
				eventListener.onConnectionReady(this);
				while (!rxThread.isInterrupted()) {
					eventListener.onReceiverString(this, bufferedReader.readLine());
				}
			} catch (IOException e) {
				eventListener.onException(this, e);
			} finally {
				eventListener.onDisconnect(this);
			}
		});
		rxThread.start();
	}

	public synchronized void sendString(String value) {
		try {
			bufferedWriter.write(String.format("%s\r\n", value));
			bufferedWriter.flush();
		} catch (IOException e) {
			eventListener.onException(this, e);
			disconnect();
		}
	}

	public synchronized void disconnect() {
		rxThread.interrupt();
		try {
			socket.close();
		} catch (IOException e) {
			eventListener.onException(this, e);
		}
	}

	@Override
	public String toString() {
		return format("TCPConnection: %s: %d",
				socket.getInetAddress(), socket.getPort());
	}
}
