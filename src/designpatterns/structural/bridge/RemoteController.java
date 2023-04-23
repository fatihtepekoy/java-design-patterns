package designpatterns.structural.bridge;

public interface RemoteController {

  void turnOn();

  void turnOff();

  void volumeUp();

  void volumeDown();

  void printDeviceName();

  void switchToDevice(Device device);

}
