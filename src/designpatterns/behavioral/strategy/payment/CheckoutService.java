package designpatterns.behavioral.strategy.payment;

public class CheckoutService {

  public void doPayment(Order order, PaymentSystem paymentSystem){
    paymentSystem.pay(order);
  }

}
