package designpatterns.structural.bridge;

public class TV implements Device{

  private static final String NAME = "TV";

  @Override
  public void turnOn() {
    System.out.println("TV is turned on");
  }

  @Override
  public void turnOff() {
    System.out.println("TV is turned off");
  }

  @Override
  public void volumeUp() {
    System.out.println("TV volume up");
  }

  @Override
  public void volumeDown() {
    System.out.println("TV volume down");
  }

  @Override
  public String getName() {
    return NAME;
  }
}
