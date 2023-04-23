package designpatterns.behavioral.command;

public class TV implements Device{


  @Override
  public void printName() {
    System.out.print("TV - ");
  }

  @Override
  public void turnOn() {
    System.out.println("TV turned on");
  }

  @Override
  public void turnOff() {
    System.out.println("TV turned off");
  }
}
