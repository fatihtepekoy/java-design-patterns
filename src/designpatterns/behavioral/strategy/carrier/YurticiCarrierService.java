package designpatterns.behavioral.strategy.carrier;

public class YurticiCarrierService implements CarrierService{

  @Override
  public void create(UniversalShipmentDto universalShipmentDto) {
    System.out.println("yurtici shipment");
  }
}
