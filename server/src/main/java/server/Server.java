package server;

import static java.lang.System.out;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

import network.CommunicationBridge;
import network.TCPConnectionListener;

public class Server implements TCPConnectionListener {

	private final List<CommunicationBridge> connections = new ArrayList<>();

	public static void main(String[] args) {
		new Server();
	}

	private Server() {
		out.println("Server running...");
		try (ServerSocket serverSocket = new ServerSocket(4444)) {
			while (true) {
				try {
					new CommunicationBridge(this, serverSocket.accept());
				} catch (IOException e) {
					out.println(String.format("TCPConnection exception: %s", e));
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public synchronized void onConnectionReady(
			CommunicationBridge tcpConnection) {
		connections.add(tcpConnection);
		out.println("Client connected: " + tcpConnection);
	}

	@Override
	public synchronized void onDisconnect(CommunicationBridge tcpConnection) {
		connections.remove(tcpConnection);
		out.println("Client disconnected: " + tcpConnection);
	}

	@Override
	public synchronized void onException(
			CommunicationBridge tcpConnection,
			Exception e) {
		out.println("TCPConnection exception: " + e);
	}

	@Override
	public synchronized void onReceiverString(
			CommunicationBridge tcpConnection, String value) {
		if (value == null) {
			return;
		}
		out.println(value);
	}
}
