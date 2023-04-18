package designpatterns.structural.proxy.license;

public class LicenseProvider implements LicenseService{

  @Override
  public boolean getLicense() {
    return true;
  }
}
