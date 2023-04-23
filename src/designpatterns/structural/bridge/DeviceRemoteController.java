package designpatterns.structural.bridge;

public class DeviceRemoteController implements RemoteController {

  private Device device;

  public DeviceRemoteController(Device device) {
    this.device = device;
  }

  public void switchToDevice(Device device) {
    System.out.println(device.getName() + " is set");
    this.device = device;
  }

  @Override
  public void turnOn() {
    device.turnOn();
  }

  @Override
  public void turnOff() {
    device.turnOff();
  }

  @Override
  public void volumeUp() {
    device.volumeUp();
  }

  @Override
  public void volumeDown() {
    device.volumeDown();
  }

  @Override
  public void printDeviceName() {
    device.getName();
  }
}
