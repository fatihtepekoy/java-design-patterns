package designpatterns.structural.adapter;

public interface ElectricitySystem {

  int getPowerVoltage();

  void givePower(HomeAppliance homeAppliance);

}
