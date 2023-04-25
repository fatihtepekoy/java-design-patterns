package designpatterns.behavioral.chainofresponsibility;


public class CreateOrderHandler extends OrderHandler {

  @Override
  protected boolean isValid(Customer customer, Order order) {
    return true;
  }

  public CreateOrderHandler(String name, String message) {
    super(name, message);
  }

  @Override
  protected void createOrder(Order order) {
    System.out.println("Order is created successfully.  Order : " + order);
  }
}