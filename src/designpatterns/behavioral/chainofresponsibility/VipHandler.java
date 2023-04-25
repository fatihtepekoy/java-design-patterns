package designpatterns.behavioral.chainofresponsibility;


public class VipHandler extends OrderHandler{

  @Override
  protected boolean isValid(Customer customer, Order order) {
    return customer.vip();
  }

  public VipHandler(String name, String message) {
    super(name, message);
  }
}