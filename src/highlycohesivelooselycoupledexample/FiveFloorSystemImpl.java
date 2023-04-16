package highlycohesivelooselycoupledexample;

public class FiveFloorSystemImpl implements IFloorSystem {

  private IFloor currentFloor = FiveFloorEnum.ENTRANCE;

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
    if (this.currentFloor == FiveFloorEnum.ENTRANCE) {
      this.currentFloor = FiveFloorEnum.FIRST;
    } else if (this.currentFloor == FiveFloorEnum.FIRST) {
      this.currentFloor = FiveFloorEnum.SECOND;
    } else if (this.currentFloor == FiveFloorEnum.SECOND) {
      this.currentFloor = FiveFloorEnum.THIRD;
    } else if (this.currentFloor == FiveFloorEnum.THIRD) {
      this.currentFloor = FiveFloorEnum.FOURTH;
    } else if (this.currentFloor == FiveFloorEnum.FOURTH) {
      this.currentFloor = FiveFloorEnum.FIFTH;
    }
  }

  @Override
  public void decreaseCurrentFloor() {
    if (this.currentFloor == FiveFloorEnum.FIFTH) {
      this.currentFloor = FiveFloorEnum.FOURTH;
    } else if (this.currentFloor == FiveFloorEnum.FOURTH) {
      this.currentFloor = FiveFloorEnum.THIRD;
    } else if (this.currentFloor == FiveFloorEnum.THIRD) {
      this.currentFloor = FiveFloorEnum.SECOND;
    } else if (this.currentFloor == FiveFloorEnum.SECOND) {
      this.currentFloor = FiveFloorEnum.FIRST;
    } else if (this.currentFloor == FiveFloorEnum.FIRST) {
      this.currentFloor = FiveFloorEnum.ENTRANCE;
    }
  }

  @Override
  public String toString() {
    String string = null;
    string = "BaseElevator: " + getCurrentFlow().getFloorNumber();
    return string;
  }


}