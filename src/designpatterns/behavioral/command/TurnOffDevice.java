package designpatterns.behavioral.command;

public class TurnOffDevice implements Command {

  private final Device device;

  public TurnOffDevice(Device device) {
    this.device = device;
  }

  @Override
  public void execute() {
    device.printName();
    device.turnOff();
  }
}
