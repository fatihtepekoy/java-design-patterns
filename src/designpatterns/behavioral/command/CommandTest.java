package designpatterns.behavioral.command;

public class CommandTest {

  public static void main(String[] args) {

    Command turnOnRadio = CommandFactory.getTurnOnDeviceCommand(new Radio());
    turnOnRadio.execute();

    Command turnOffRadio = CommandFactory.getTurnOffDeviceCommand(new TV());
    turnOffRadio.execute();


  }
}
