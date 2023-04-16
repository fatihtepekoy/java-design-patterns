package highlycohesivelooselycoupledexample;

public class EmployeeElevator extends BaseElevator {

  private EmployeeCardReaderService employeeCardReaderService = new EmployeeCardReaderService();
  private boolean isEmployeeCardValid = false;

  public void readEmployeeCard(EmployeeCard employeeCard) {
    isEmployeeCardValid = employeeCardReaderService.checkEmployeeCard(employeeCard);
  }

  @Override
  public void go(IFloor floor) {
    if (isEmployeeCardValid) {
      super.go(floor);
    } else {
      System.out.println("You are not authorized to use this elevator!!!. Please push your employee card to the card reader.");
    }
  }

  public EmployeeElevator(IFloorSystem elevatorFloorSystem, int capacity) {
    super(elevatorFloorSystem, capacity);
  }
}
