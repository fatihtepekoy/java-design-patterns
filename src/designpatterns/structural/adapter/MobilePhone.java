package designpatterns.structural.adapter;

public class MobilePhone implements ElectronicDevices {

  private int suitableVoltage = 5;

  @Override
  public int getSuitableVoltage() {
    return suitableVoltage;
  }

  @Override
  public void start(int voltage) {
    if (voltage > suitableVoltage) {
      System.out.println("it is broken");
    } else {
      System.out.println("Phone charging is started");
    }
  }
}
