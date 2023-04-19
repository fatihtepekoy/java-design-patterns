package designpatterns.structural.decorator.salary;

public class DisabilityCompensationDecorator extends CompensationDecorator{

  private static final int AMOUNT = 200;

  public DisabilityCompensationDecorator(Compensation compensation) {
    super(compensation);
  }

  @Override
  public int getAmount() {
    return compensation.getAmount() + AMOUNT;
  }
}
