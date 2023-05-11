package designpatterns.behavioral.strategy.carrier;

public class UniversalShipmentDto {

  private String carrier;

  public UniversalShipmentDto(String carrier) {
    this.carrier = carrier;
  }

  public String getCarrier() {
    return carrier;
  }
}
