package designpatterns.structural.proxy.license;

public class LicenseProxyServer implements LicenseService {

  private final LicenseProvider licenseProvider = new LicenseProvider();

  private int availableLicenseCount;

  public LicenseProxyServer(int availableLicenseCount) {
    this.availableLicenseCount = availableLicenseCount;
  }

  @Override
  public License getLicense() throws Exception {
    if (availableLicenseCount > 0) {
      availableLicenseCount--;
      return licenseProvider.getLicense();
    }
    throw new Exception("License exhausted");
  }

}
