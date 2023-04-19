package designpatterns.structural.proxy.license;

public class LicenseProxyServer implements LicenseService {

  private final LicenseProvider licenseProvider = new LicenseProvider();

  private int availableLicenseCount;

  public LicenseProxyServer(int availableLicenseCount) {
    this.availableLicenseCount = availableLicenseCount;
  }

  @Override
  public boolean getLicense() {
    if (availableLicenseCount > 0) {
      if (licenseProvider.getLicense()) {
        availableLicenseCount--;
        return true;
      }
    }
    return false;
  }
}
