package designpatterns.structural.proxy.license;

public class ClientTest {

  public static void main(String[] args) {
    // we provided a proxy license server to the application to check the available licence number
    // That proxy license server will get a new license if there are
    LicenseService licenseService = new LicenseProxyServer(20);
    Application application = new Application(licenseService);

    for (int i = 0; i < 25; i++) {
      application.start();
    }

  }
}
