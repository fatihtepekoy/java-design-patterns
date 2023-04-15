package highlycohesivelooselycoupledexample;

public class Elevator implements IElevator {

  private static final int CAPACITY = 1000;

  private final IFloorSystem elevatorFloorSystem;

  private boolean doorOpen = false;
  private boolean stopped = true;
  private int weight = 0;

  public Elevator(IFloorSystem elevatorFloorSystem) {
    this.elevatorFloorSystem = elevatorFloorSystem;
  }

  public void openDoor() {
    if (stopped) {
      doorOpen = true;
    }
    System.out.println("Door is open.");
  }

  public void go(IFloor floor) {
    System.out.println("Current Floor: " + elevatorFloorSystem.getCurrentFlow().getFloorNumber());
    System.out.println("Desired Floor: " + floor.getFloorNumber());
    int compare = elevatorFloorSystem.compareTo(floor);
    while (compare != 0) {
      if (compare < 0) {
        goUp();
      } else {
        goDown();
      }
      compare = elevatorFloorSystem.compareTo(floor); // Do t<his otherwise loop goes iinfinitely
    }
    stop();
    System.out.println("Came to the floor: " + elevatorFloorSystem.getCurrentFlow().getFloorNumber());
  }

  private void goUp() {
    System.out.println("Going to upper floors");
    elevatorFloorSystem.increaseCurrentFloor();
  }

  private void goDown() {
    System.out.println("Going to lower floors");
    elevatorFloorSystem.decreaseCurrentFloor();
  }


  public void closeDoor() {
    calculateCapacity();
    if (weight <= CAPACITY) {
      doorOpen = false;
      System.out.println("Door is closed.");
    } else {
      System.out.println("The elevator has exceeded capacity, doors will remain open until someone exits!");
    }
  }

  private void calculateCapacity() {
    weight = (int) (Math.random() * 1500);
    System.out.println("The weight is " + weight);
  }


  private void stop() {
    stopped = true;
    openDoor();
  }

  public boolean getDoorStatus() {
    return doorOpen;
  }

}
