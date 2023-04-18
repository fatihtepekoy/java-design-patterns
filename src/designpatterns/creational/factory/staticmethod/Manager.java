package designpatterns.creational.factory.staticmethod;

public class Manager extends Employee {

  private String sectorReports;

  private Manager(int age, String name, String surname, String country, int salary, String sectorReports) {
    super(age, name, surname, country, salary);
    this.sectorReports = sectorReports;
  }

  public static Employee createManagerWithDefaultCountryAndSalaryAndReport(int age,String name,String surname){
    return new Manager(age, name,surname,"Turkey", 80, "no report");
  }

  public void  manage(){
    System.out.println("started managing");
  }
}
