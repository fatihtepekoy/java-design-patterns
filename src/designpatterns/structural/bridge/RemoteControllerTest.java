package designpatterns.structural.bridge;

public class RemoteControllerTest {

  public static void main(String[] args) {

    Device tv = new TV();
    Device radio = new Radio();

    RemoteController remoteController =  new DeviceRemoteController(tv);
    remoteController.turnOn();
    remoteController.volumeUp();
    remoteController.turnOff();

    remoteController.switchToDevice(radio);
    remoteController.turnOn();
    remoteController.volumeUp();
    remoteController.turnOff();



  }

}
