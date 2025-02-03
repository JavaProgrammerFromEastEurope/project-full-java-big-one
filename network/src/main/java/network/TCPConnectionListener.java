package network;

public interface TCPConnectionListener {
	void onConnectionReady(CommunicationBridge tcpConnection);
	void onReceiverString(CommunicationBridge tcpConnection, String value);
	void onDisconnect(CommunicationBridge tcpConnection);
	void onException(CommunicationBridge tcpConnection, Exception e);
}
