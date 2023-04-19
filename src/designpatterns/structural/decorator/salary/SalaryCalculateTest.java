package designpatterns.structural.decorator.salary;

public class SalaryCalculateTest {

  public static void main(String[] args) {
    LanguageCompensationDecorator languageCompensationDecorator = new LanguageCompensationDecorator(new BaseAbstractCompensation());
    DisabilityCompensationDecorator disabilityCompensationDecorator = new DisabilityCompensationDecorator(
        languageCompensationDecorator);
    Employee employee = new Employee(1000,disabilityCompensationDecorator);
    System.out.println("employee.getBaseSalary() = " + employee.getBaseSalary());
    System.out.println("employee.getTotalSalary() = " + employee.getTotalSalary());

  }

}
