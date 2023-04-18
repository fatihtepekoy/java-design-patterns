package designpatterns.structural.adapter;

public class ElectronicDeviceToHomeApplianceAdapter implements HomeAppliance{

  private int suitableVoltage = 5;
  private ElectronicDevices electronicDevices;

  public ElectronicDeviceToHomeApplianceAdapter(ElectronicDevices electronicDevices) {
    this.electronicDevices = electronicDevices;
  }

  @Override
  public int getSuitableVoltage() {
    return suitableVoltage;
  }

  @Override
  public void start(int voltage) {
    int newVoltage = voltageConverter(voltage);
    System.out.println("adapter is running the device");
    electronicDevices.start(newVoltage);
  }

  private int voltageConverter(int voltage) {
    System.out.println("voltage is converted for the Electronic devices");
    return suitableVoltage;
  }
}
