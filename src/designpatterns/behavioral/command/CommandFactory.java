package designpatterns.behavioral.command;

public class CommandFactory {

  public static Command getTurnOffDeviceCommand(Device device){
    return new TurnOffDevice(device);
  }

  public static Command getTurnOnDeviceCommand(Device device){
    return new TurnOnDevice(device);
  }

}
