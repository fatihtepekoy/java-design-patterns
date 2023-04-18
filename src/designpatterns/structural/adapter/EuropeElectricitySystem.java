package designpatterns.structural.adapter;

public class EuropeElectricitySystem implements ElectricitySystem {

  private int voltage = 220;

  @Override
  public int getPowerVoltage() {
    return voltage;
  }

  @Override
  public void givePower(HomeAppliance homeAppliance) {
    homeAppliance.start(voltage);
  }
}
