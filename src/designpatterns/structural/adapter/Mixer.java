package designpatterns.structural.adapter;

public class Mixer implements HomeAppliance {

  private int suitableVoltage = 220;

  @Override
  public int getSuitableVoltage() {
    return suitableVoltage;
  }

  @Override
  public void start(int voltage) {
    if (voltage > suitableVoltage) {
      System.out.println("it is broken");
    } else {
      System.out.println("Mixer is running");
    }
  }

}
