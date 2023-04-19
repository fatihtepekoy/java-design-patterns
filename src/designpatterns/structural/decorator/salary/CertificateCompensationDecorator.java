package designpatterns.structural.decorator.salary;

public class CertificateCompensationDecorator extends CompensationDecorator{

  private static final int AMOUNT = 50;

  public CertificateCompensationDecorator(Compensation compensation) {
    super(compensation);
  }

  @Override
  public int getAmount() {
    return compensation.getAmount() + AMOUNT;
  }
}
