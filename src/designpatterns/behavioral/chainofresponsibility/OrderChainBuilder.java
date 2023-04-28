package designpatterns.behavioral.chainofresponsibility;

public class OrderChainBuilder {

  public static OrderHandler getOrderChain() {
    OrderHandler createOrderHandler = new CreateOrderHandler("CreateOrderHandler", "Order create error");
    OrderHandler balanceControlHandler = new BalanceControlHandler("BalanceControlHandler", "Not enough balance");
    balanceControlHandler.setAnswerIsYesOrderHandler(createOrderHandler);

    OrderHandler licenseDateControlHandler = new LicenseDateControlHandler("LicenseDateControlHandler", "License expired");
    licenseDateControlHandler.setAnswerIsNoOrderHandler(balanceControlHandler);
    licenseDateControlHandler.setAnswerIsYesOrderHandler(createOrderHandler);

    OrderHandler ageControlHandler = new AgeControlHandler("AgeControlHandler", "Age is not valid");
    ageControlHandler.setAnswerIsNoOrderHandler(licenseDateControlHandler);
    ageControlHandler.setAnswerIsYesOrderHandler(balanceControlHandler);

    OrderHandler vipHandler = new VipHandler("VipHandler", "Not a vip customer");
    vipHandler.setAnswerIsNoOrderHandler(ageControlHandler);
    vipHandler.setAnswerIsYesOrderHandler(createOrderHandler);

    return vipHandler;
  }

  private OrderChainBuilder() {
  }
}
