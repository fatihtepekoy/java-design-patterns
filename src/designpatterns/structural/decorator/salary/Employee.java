package designpatterns.structural.decorator.salary;

public class Employee {

  private final int baseSalary;
  private final Compensation compensation;

  public Employee(int baseSalary, Compensation compensation) {
    this.baseSalary = baseSalary;
    this.compensation = compensation;
  }

  public int getBaseSalary() {
    return baseSalary;
  }

  public int getTotalSalary() {
    return baseSalary + compensation.getAmount();
  }
}
