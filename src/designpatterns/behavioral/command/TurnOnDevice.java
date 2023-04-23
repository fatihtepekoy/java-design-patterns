package designpatterns.behavioral.command;

public class TurnOnDevice implements Command {

  private final Device device;

  public TurnOnDevice(Device device) {
    this.device = device;
  }

  @Override
  public void execute() {
    device.printName();
    device.turnOn();
  }
}
