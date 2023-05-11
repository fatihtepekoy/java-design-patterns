package designpatterns.behavioral.strategy.carrier;

public class CarrierStrategyTest {

  public static void main(String[] args) {
    ShipmentProcessor shipmentProcessor = new ShipmentProcessor(); // Controller
    UniversalShipmentDto shipmentDto = new UniversalShipmentDto("ARAS"); // Populated by incoming request
    shipmentProcessor.createShipment(shipmentDto);
  }

}
