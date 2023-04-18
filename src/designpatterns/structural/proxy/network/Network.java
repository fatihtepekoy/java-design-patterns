package designpatterns.structural.proxy.network;

public interface Network {
	void telnet(String ip, String targetIp) throws BannedIpException;
	void ftp(String ip, String targetIp) throws BannedIpException;
}
