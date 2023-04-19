package designpatterns.structural.decorator.salary;

public class DoctorDegreeCompensationDecorator extends CompensationDecorator{

  private static final int AMOUNT = 150;

  public DoctorDegreeCompensationDecorator(Compensation compensation) {
    super(compensation);
  }

  @Override
  public int getAmount() {
    return compensation.getAmount() + AMOUNT;
  }
}
