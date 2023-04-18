package designpatterns.creational.factory.regular;

public class ManagerFactory implements Factory {


  @Override
  public Employee createDefault(int age, String name, String surname) {
    return new Manager(age,name,surname,"Turkey", 80, "no report");
  }
}
