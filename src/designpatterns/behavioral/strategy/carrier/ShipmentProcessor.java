package designpatterns.behavioral.strategy.carrier;

import java.util.HashMap;

public class ShipmentProcessor implements ShipmentService {

  private HashMap<String, CarrierService> carrierServiceHashMap = new HashMap<>();


  // postConstruct
  private void initCarriers(){
    carrierServiceHashMap.put("ARAS", new ArasCarrierService());
    carrierServiceHashMap.put("YURTICI", new YurticiCarrierService());
  }

  private void createShipment(CarrierService carrierService, UniversalShipmentDto universalShipmentDto) {
    carrierService.create(universalShipmentDto);
  }

  @Override
  public void createShipment(UniversalShipmentDto shipmentDto) {
    CarrierService carrierService = carrierServiceHashMap.get(shipmentDto.getCarrier());
    createShipment(carrierService, shipmentDto);
  }
}
