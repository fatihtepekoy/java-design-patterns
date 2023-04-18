package designpatterns.creational.factory.regular;

public class Manager extends Employee{

  private String sectorReports;

  public Manager(int age, String name, String surname, String country, int salary, String sectorReports) {
    super(age, name, surname, country, salary);
    this.sectorReports = sectorReports;
  }

  public void  manage(){
    System.out.println("started managing");
  }
}
