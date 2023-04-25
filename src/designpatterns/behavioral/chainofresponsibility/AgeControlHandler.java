package designpatterns.behavioral.chainofresponsibility;


public class AgeControlHandler extends OrderHandler{

  @Override
  protected boolean isValid(Customer customer, Order order) {
    return customer.age() < 18;
  }

  public AgeControlHandler(String name, String message) {
    super(name, message);
  }

}