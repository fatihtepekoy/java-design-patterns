package designpatterns.creational.factory.regular;

public class FactoryTest {

  public static void main(String[] args) {
    HR hr = new HR();
    Factory employeeFactory = new EmployeeFactory();
    Factory managerFactory = new ManagerFactory();

    Employee employee = employeeFactory.createDefault(35, "Fatih", "Tepekoy");
    Employee manager = managerFactory.createDefault(53, "Enes", "Yildiz");

    hr.addNewEmployee(employee);
    hr.addNewEmployee(manager);

  }

}
