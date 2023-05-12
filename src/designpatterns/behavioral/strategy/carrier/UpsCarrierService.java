package designpatterns.behavioral.strategy.carrier;

public class UpsCarrierService implements CarrierService{

  @Override
  public void create(UniversalShipmentDto universalShipmentDto) {
    System.out.println("Ups ships");
  }
}
