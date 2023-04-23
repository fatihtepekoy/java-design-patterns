package designpatterns.behavioral.strategy.payment;

public class Paypal implements PaymentSystem{

  @Override
  public void pay(Order order) {
    System.out.println("Paid by credit paypal. Amount : " + order.amount());
  }
}
