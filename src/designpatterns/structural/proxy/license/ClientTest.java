package designpatterns.structural.proxy.license;

public class ClientTest {

  public static void main(String[] args) {
    // we provided a proxy license server to the licensedApplication to check the available licence number
    // That proxy license server will get a new license if there are
    LicenseService licenseService = new LicenseProxyServer(20);
    LicensedApplication licensedApplication = new LicensedApplication(licenseService);

    try {
      for (int i = 0; i < 25; i++) {
        licensedApplication.start();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("There is no available license, please try again later.");
    }
  }
}
