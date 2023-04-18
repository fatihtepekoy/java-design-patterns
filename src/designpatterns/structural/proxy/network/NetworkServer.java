package designpatterns.structural.proxy.network;

public class NetworkServer {
	
	private static final NetworkServer networkServer = new NetworkServer();
	private final Network network;
	
	private NetworkServer(){
		network = new ProxyServer();
	}
	
	public Network getNetwork(){
		return network;
	}
	
	public static NetworkServer getInstance(){
		return networkServer;
	}
}
