package designpatterns.structural.proxy.license;

public class LicenseProvider implements LicenseService{

  @Override
  public License getLicense() {
    return new License();
  }
}
