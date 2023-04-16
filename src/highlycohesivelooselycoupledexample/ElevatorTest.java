package highlycohesivelooselycoupledexample;


public class ElevatorTest {

  public static void main(String args[]) {

    System.out.println("==== 5 floor test ====");
    FiveFloorSystemImpl fiveFloorSystemImpl = new FiveFloorSystemImpl();
    BaseElevator elevatorForFiveFloors = new VisitorElevator(fiveFloorSystemImpl, 1000);
    elevatorForFiveFloors.openDoor(); // Get into the elevatorForFiveFloors
    elevatorForFiveFloors.closeDoor();
    elevatorForFiveFloors.openDoor(); // Somebody is coming :)
    elevatorForFiveFloors.go(FiveFloorEnum.THIRD);
    elevatorForFiveFloors.go(FiveFloorEnum.SECOND);
    elevatorForFiveFloors.go(FiveFloorEnum.FIFTH);

    System.out.println("==== 3 floor test ====");
    ThreeFloorSystemImpl threeFloorSystemImpl = new ThreeFloorSystemImpl();
    BaseElevator elevatorForThreeFloors = new VisitorElevator(threeFloorSystemImpl, 750);
    elevatorForThreeFloors.openDoor(); // Somebody is coming :)
    elevatorForThreeFloors.go(ThreeFloorEnum.THIRD_FLOOR);
    elevatorForThreeFloors.go(ThreeFloorEnum.FIRST_FLOOR);
    elevatorForThreeFloors.go(ThreeFloorEnum.SECOND_FLOOR);


    System.out.println("==== 3 floor Employee elevator test - valid card ====");
    EmployeeElevator employeeElevator = new EmployeeElevator(threeFloorSystemImpl, 750);
    employeeElevator.openDoor(); // Somebody is coming :)
    employeeElevator.readEmployeeCard(new EmployeeCard("1"));
    employeeElevator.go(ThreeFloorEnum.THIRD_FLOOR);
    employeeElevator.go(ThreeFloorEnum.FIRST_FLOOR);
    employeeElevator.go(ThreeFloorEnum.SECOND_FLOOR);


    System.out.println("==== 3 floor Employee elevator test - no card ====");
    EmployeeElevator employeeElevatorTwo = new EmployeeElevator(threeFloorSystemImpl, 750);
    employeeElevatorTwo.go(ThreeFloorEnum.THIRD_FLOOR);

  }

}
