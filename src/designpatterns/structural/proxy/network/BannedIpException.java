package designpatterns.structural.proxy.network;

public class BannedIpException extends Exception{
	
	public BannedIpException(String message){
		super(message);
	}
}
