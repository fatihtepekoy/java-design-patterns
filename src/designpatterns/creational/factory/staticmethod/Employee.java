package designpatterns.creational.factory.staticmethod;

import java.time.LocalDateTime;
import java.util.UUID;

public class Employee {

  private UUID uniqueId = UUID.randomUUID();
  private LocalDateTime createDate = LocalDateTime.now();
  private int age;
  private String name;
  private String surname;
  private String country;
  private int salary;


  protected Employee(int age, String name, String surname, String country, int salary) {
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

  public static Employee createEmployeeWithDefaultCountryAndSalary(int age,String name,String surname){
    return new Employee(age, name,surname,"Turkey", 50);
  }
}
