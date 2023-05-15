package designpatterns.behavioral.strategy.carrier;

public class FedexCarrierService implements CarrierService{


  @Override
  public void create(UniversalShipmentDto universalShipmentDto) {
    System.out.println("Fedex ships");
  }
}
