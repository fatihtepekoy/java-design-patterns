package designpatterns.creational.factory.regular;

public class Employee {

  private int age;
  private String name;
  private String surname;
  private String country;
  private int salary;

  public Employee(int age, String name, String surname, String country, int salary) {
    this.age = age;
    this.name = name;
    this.surname = surname;
    this.country = country;
    this.salary = salary;
  }

  public void work() {
    System.out.println("Started working");
  }

  @Override
  public String toString() {
    return "Employee{" +
        "age=" + age +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        '}';
  }
}
