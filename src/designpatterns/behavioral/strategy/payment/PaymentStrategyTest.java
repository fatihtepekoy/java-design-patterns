package designpatterns.behavioral.strategy.payment;

public class PaymentStrategyTest {

  public static void main(String[] args) {
    CheckoutService checkoutService = new CheckoutService();
    Order order = new Order(200);

    checkoutService.doPayment(order, new CreditCard());
    checkoutService.doPayment(order, new Paypal());

  }

}
