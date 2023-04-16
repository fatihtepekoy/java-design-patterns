package highlycohesivelooselycoupledexample;

public class EmployeeCardReaderService {

  public boolean checkEmployeeCard(EmployeeCard employeeCard){
    return employeeCard.getId().equals("1");
  }

}
