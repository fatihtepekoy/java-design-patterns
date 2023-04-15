package highlycohesivelooselycoupledexample;


public class ElevatorTest {

  public static void main(String args[]) {

    System.out.println("==== 5 floor test ====");
    FiveFloorSystemImpl fiveFloorSystemImpl = new FiveFloorSystemImpl();
    IElevator elevatorForFiveFloors = new Elevator(fiveFloorSystemImpl);
    elevatorForFiveFloors.openDoor(); // Get into the elevatorForFiveFloors
    elevatorForFiveFloors.closeDoor();
    elevatorForFiveFloors.openDoor(); // Somebody is coming :)
    elevatorForFiveFloors.go(FiveFloorEnum.THIRD);
    elevatorForFiveFloors.go(FiveFloorEnum.SECOND);
    elevatorForFiveFloors.go(FiveFloorEnum.FIFTH);

    System.out.println("==== 3 floor test ====");
    ThreeFloorSystemImpl threeFloorSystemImpl = new ThreeFloorSystemImpl();
    IElevator elevatorForThreeFloors = new Elevator(threeFloorSystemImpl);
    elevatorForThreeFloors.openDoor(); // Somebody is coming :)
    elevatorForThreeFloors.go(ThreeFloorEnum.THIRD_FLOOR);
    elevatorForThreeFloors.go(ThreeFloorEnum.FIRST_FLOOR);
    elevatorForThreeFloors.go(ThreeFloorEnum.SECOND_FLOOR);










  }

}
