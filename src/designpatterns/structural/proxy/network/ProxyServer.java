package designpatterns.structural.proxy.network;

public class ProxyServer implements Network {

  private Network gateway;

  public ProxyServer() {
    gateway = Gateway.getInstance();
  }

  public void ftp(String ip, String targetIp) throws BannedIpException {
    Logger.log(ip + " wants to ftp to the " + targetIp);
    filter("ftp", ip, targetIp);
    gateway.ftp(ip, targetIp);
  }

  public void telnet(String ip, String targetIp) throws BannedIpException {
    Logger.log(ip + " wants to telnet to the " + targetIp);
    filter("telnet", ip, targetIp);
    gateway.telnet(ip, targetIp);
  }

  private void filter(String protocol, String ip, String targetIp) throws BannedIpException {
    if (protocol.equals("ftp")) {
      if (targetIp.startsWith("192")) {
        throw new BannedIpException(targetIp + " is banned!");
      }
    }

    if (protocol.equals("telnet")) {
      if (ip.startsWith("10")) {
        throw new BannedIpException(ip + " is banned!");
      }
    }
  }
}
