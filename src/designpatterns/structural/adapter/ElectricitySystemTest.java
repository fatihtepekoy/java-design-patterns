package designpatterns.structural.adapter;

public class ElectricitySystemTest {

  public static void main(String[] args) {
    ElectricitySystem europeElectricitySystem = new EuropeElectricitySystem();
    HomeAppliance mixer = new Mixer();
    System.out.println("europe Electricity System PowerVoltage = " + europeElectricitySystem.getPowerVoltage());
    europeElectricitySystem.givePower(mixer);

    ElectronicDevices mobilePhone = new MobilePhone();
    // europeElectricitySystem.givePower(mobilePhone); -> We need to wrap mobile phone with the adapter class of ElectricitySystem
    ElectronicDeviceToHomeApplianceAdapter deviceAdapter = new ElectronicDeviceToHomeApplianceAdapter(mobilePhone);
    europeElectricitySystem.givePower(deviceAdapter);


  }
}
