package designpatterns.behavioral.chainofresponsibility;


import java.time.LocalDateTime;
import java.time.Period;

public class LicenseDateControlHandler extends OrderHandler{

  @Override
  protected boolean isValid(Customer customer, Order order) {
    LocalDateTime now = LocalDateTime.now();
    Period period = Period.between(now.toLocalDate(),customer.licenseExpireDate().toLocalDate());
    return period.getDays() > 365;
  }

  public LicenseDateControlHandler(String name, String message) {
    super(name, message);
  }

}