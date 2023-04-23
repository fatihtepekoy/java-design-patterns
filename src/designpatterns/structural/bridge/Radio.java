package designpatterns.structural.bridge;

public class Radio implements Device{

  private static final String NAME = "Radio";

  @Override
  public void turnOn() {
    System.out.println("Radio is turned on");
  }

  @Override
  public void turnOff() {
    System.out.println("Radio is turned off");
  }

  @Override
  public void volumeUp() {
    System.out.println("Radio volume up");
  }

  @Override
  public void volumeDown() {
    System.out.println("Radio volume down");
  }

  @Override
  public String getName() {
    return NAME;
  }
}
