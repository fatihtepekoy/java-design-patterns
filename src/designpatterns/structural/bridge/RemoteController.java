package designpatterns.structural.bridge;

public abstract class RemoteController {

  protected Device device;

  protected RemoteController(Device device) {
    this.device = device;
  }

  public Device getDevice() {
    return device;
  }

  public void turnOn() {
    device.turnOn();
  }

  public void turnOff() {
    device.turnOff();
  }

  public void volumeUp() {
    device.volumeUp();
  }

  public void volumeDown() {
    device.volumeDown();
  }

  public void printDeviceName() {
    device.getName();
  }

  public void switchToDevice(Device device){
    System.out.println(device.getName() + " is set");
    this.device = device;
  }

}
