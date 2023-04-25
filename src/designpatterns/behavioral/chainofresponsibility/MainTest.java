package designpatterns.behavioral.chainofresponsibility;

import java.time.LocalDateTime;

public class MainTest {

  public static void main(String[] args) {
    try {
      System.out.println("Vip customer");
      System.out.println("==================================");
      OrderHandler orderChain = OrderChainBuilder.getOrderChain();
      Customer fatih = new Customer("Fatih", 15, 50L, true, LocalDateTime.of(2025, 1, 1, 1, 1));
      Order order = new Order(1, 40);
      orderChain.handle(fatih, order);


      System.out.println("\n Not Vip customer - 15 years old, enough balance");
      System.out.println("==================================");
      fatih = new Customer("Fatih", 15, 50L, false, LocalDateTime.of(2025, 1, 1, 1, 1));
      order = new Order(1, 40);
      orderChain.handle(fatih, order);


      System.out.println("\n Not Vip customer - 25 years old, not enough balance, remaining license days > 365");
      System.out.println("==================================");
      fatih = new Customer("Fatih", 25, 30L, false, LocalDateTime.of(2025, 1, 1, 1, 1));
      order = new Order(1, 40);
      orderChain.handle(fatih, order);

      System.out.println("\n Not Vip customer - 25 years old, not enough balance, remaining license days < 365");
      System.out.println("==================================");
      fatih = new Customer("Fatih", 25, 30L, false, LocalDateTime.of(2024, 1, 1, 1, 1));
      order = new Order(1, 40);
      orderChain.handle(fatih, order);


    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
