package designpatterns.structural.proxy.license;

public class Application {

  private final LicenseService licenseService;

  public Application(LicenseService licenseService) {
    this.licenseService = licenseService;
  }

  public void start(){
    boolean license = licenseService.getLicense();
    if (license) {
      System.out.println("Application is started.");
    } else {
      System.out.println("There is no available license, please try again later.");
    }
  }
}
