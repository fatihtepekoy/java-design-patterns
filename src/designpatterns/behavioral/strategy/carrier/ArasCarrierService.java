package designpatterns.behavioral.strategy.carrier;

public class ArasCarrierService implements CarrierService{

  @Override
  public void create(UniversalShipmentDto universalShipmentDto) {
    System.out.println("aras shipment");
  }
}
