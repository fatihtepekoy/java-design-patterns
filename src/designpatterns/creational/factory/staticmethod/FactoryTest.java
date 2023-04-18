package designpatterns.creational.factory.staticmethod;

public class FactoryTest {

  public static void main(String[] args) {
    HR hr = new HR();

    Employee employee = Employee.createEmployeeWithDefaultCountryAndSalary(35, "Fatih", "Tepekoy");
    Employee manager = Manager.createManagerWithDefaultCountryAndSalaryAndReport(53, "Enes", "Yildiz");

    hr.addNewEmployee(employee);
    hr.addNewEmployee(manager);

  }

}
