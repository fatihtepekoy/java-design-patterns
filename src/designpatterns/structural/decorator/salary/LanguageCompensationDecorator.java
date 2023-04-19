package designpatterns.structural.decorator.salary;

public class LanguageCompensationDecorator extends CompensationDecorator{

  private static final int AMOUNT = 500;

  public LanguageCompensationDecorator(Compensation compensation) {
    super(compensation);
  }

  @Override
  public int getAmount() {
    return compensation.getAmount() + AMOUNT;
  }
}
