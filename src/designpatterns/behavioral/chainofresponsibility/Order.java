package designpatterns.behavioral.chainofresponsibility;

public record Order(long id, long amount) {

  @Override
  public String toString() {
    return "Order{" +
        "id=" + id +
        ", amount=" + amount +
        '}';
  }
}
