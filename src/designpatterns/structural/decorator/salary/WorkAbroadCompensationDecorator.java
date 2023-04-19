package designpatterns.structural.decorator.salary;

public class WorkAbroadCompensationDecorator extends CompensationDecorator{

  private static final int AMOUNT = 350;

  public WorkAbroadCompensationDecorator(Compensation compensation) {
    super(compensation);
  }

  @Override
  public int getAmount() {
    return compensation.getAmount() + AMOUNT;
  }
}
