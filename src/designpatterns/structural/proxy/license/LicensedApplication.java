package designpatterns.structural.proxy.license;

public class LicensedApplication {

  private final LicenseService licenseService;

  public LicensedApplication(LicenseService licenseService) {
    this.licenseService = licenseService;
  }

  public void start() throws Exception {
    License license = licenseService.getLicense();
    System.out.println("Application is started. License number: " + license.getCode());
  }
}
