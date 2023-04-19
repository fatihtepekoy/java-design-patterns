package designpatterns.structural.decorator.salary;

public class MasterDegreeCompensationDecorator extends CompensationDecorator{

  private static final int AMOUNT = 100;

  public MasterDegreeCompensationDecorator(Compensation compensation) {
    super(compensation);
  }

  @Override
  public int getAmount() {
    return compensation.getAmount() + AMOUNT;
  }
}
