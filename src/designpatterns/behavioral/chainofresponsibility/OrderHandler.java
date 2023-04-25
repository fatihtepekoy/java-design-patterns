package designpatterns.behavioral.chainofresponsibility;


abstract class OrderHandler {

  private OrderHandler answerIsYesOrderHandler;
  private OrderHandler answerIsNoOrderHandler;
  private final String name;
  private final String message;

  protected OrderHandler(String name, String message) {
    this.name = name;
    this.message = message;
  }

  public void handle(Customer customer, Order order) throws Exception {
    System.out.println("handler name : " + name);

    if (isValid(customer, order)) {
      if (answerIsYesOrderHandler != null) {
        answerIsYesOrderHandler.handle(customer, order);
      } else {
        createOrder(order);
      }
    } else {
      if (answerIsNoOrderHandler != null) {
        answerIsNoOrderHandler.handle(customer, order);
      } else {
        throw new Exception(message);
      }
    }
  }

  protected void createOrder(Order order){
    System.out.println("Order is created successfully. Order : " + order);
  }

  protected abstract boolean isValid(Customer customer, Order order);

  public void setAnswerIsYesOrderHandler(OrderHandler answerIsYesOrderHandler) {
    this.answerIsYesOrderHandler = answerIsYesOrderHandler;
  }

  public void setAnswerIsNoOrderHandler(OrderHandler answerIsNoOrderHandler) {
    this.answerIsNoOrderHandler = answerIsNoOrderHandler;
  }
}