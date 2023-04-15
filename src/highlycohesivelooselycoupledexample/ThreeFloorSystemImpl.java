package highlycohesivelooselycoupledexample;

public class ThreeFloorSystemImpl implements IFloorSystem {

  private IFloor currentFloor = ThreeFloorEnum.GROUND;

  @Override
  public int compareTo(IFloor floor) {
    return Integer.compare(currentFloor.getFloorNumber(), floor.getFloorNumber());
  }

  @Override
  public IFloor getCurrentFlow() {
    return currentFloor;
  }

  @Override
  public void increaseCurrentFloor() {
    if (currentFloor == ThreeFloorEnum.GROUND) {
      currentFloor = ThreeFloorEnum.FIRST_FLOOR;
    } else if (currentFloor == ThreeFloorEnum.FIRST_FLOOR) {
      currentFloor = ThreeFloorEnum.SECOND_FLOOR;
    } else if (currentFloor == ThreeFloorEnum.SECOND_FLOOR) {
      currentFloor = ThreeFloorEnum.THIRD_FLOOR;
    }
  }

  @Override
  public void decreaseCurrentFloor() {
    if (currentFloor == ThreeFloorEnum.THIRD_FLOOR) {
      currentFloor = ThreeFloorEnum.SECOND_FLOOR;
    } else if (currentFloor == ThreeFloorEnum.SECOND_FLOOR) {
      currentFloor = ThreeFloorEnum.FIRST_FLOOR;
    } else if (currentFloor == ThreeFloorEnum.FIRST_FLOOR) {
      currentFloor = ThreeFloorEnum.GROUND;
    }
  }

}