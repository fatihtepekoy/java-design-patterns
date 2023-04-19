package designpatterns.structural.decorator.salary;

public class BaseAbstractCompensation implements Compensation{

  private static final int AMOUNT = 0;

  @Override
  public int getAmount() {
    return AMOUNT;
  }
}
