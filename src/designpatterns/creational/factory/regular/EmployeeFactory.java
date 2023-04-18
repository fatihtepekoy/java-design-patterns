package designpatterns.creational.factory.regular;

public class EmployeeFactory implements Factory {

  @Override
  public Employee createDefault(int age, String name, String surname) {
    return new Employee(age, name, surname, "Turkey", 50);
  }
}
