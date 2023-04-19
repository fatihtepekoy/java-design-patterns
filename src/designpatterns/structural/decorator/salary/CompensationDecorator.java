package designpatterns.structural.decorator.salary;

public abstract class CompensationDecorator implements Compensation{
  protected final Compensation compensation;

  protected CompensationDecorator(Compensation compensation) {
    this.compensation = compensation;
  }

  @Override
  public int getAmount() {
    return compensation.getAmount();
  }
}
