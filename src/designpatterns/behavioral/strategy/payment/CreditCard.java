package designpatterns.behavioral.strategy.payment;

public class CreditCard implements PaymentSystem{

  @Override
  public void pay(Order order) {
    System.out.println("Paid by credit card. Amount : " + order.amount());
  }
}
