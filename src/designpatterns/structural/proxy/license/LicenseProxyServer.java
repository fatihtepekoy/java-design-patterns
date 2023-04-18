package designpatterns.structural.proxy.license;

public class LicenseProxyServer implements LicenseService {

  private LicenseProvider licenseProvider = new LicenseProvider();

  private int AVAILABLE_LICENSE_COUNT = 20;

  @Override
  public boolean getLicense() {
    if (AVAILABLE_LICENSE_COUNT > 0) {
      if (licenseProvider.getLicense()) {
        AVAILABLE_LICENSE_COUNT--;
        return true;
      }
    }
    return false;
  }
}
