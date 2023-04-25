package designpatterns.behavioral.chainofresponsibility;


public class BalanceControlHandler extends OrderHandler{

  @Override
  protected boolean isValid(Customer customer, Order order) {
    return order.amount() < customer.balance();
  }


  public BalanceControlHandler(String name, String message) {
    super(name, message);
  }

}