package designpatterns.behavioral.command;

public class Radio implements Device{


  @Override
  public void printName() {
    System.out.print("Radio - ");
  }

  @Override
  public void turnOn() {
    System.out.println("Radio turned on");
  }

  @Override
  public void turnOff() {
    System.out.println("Radio turned off");
  }
}
