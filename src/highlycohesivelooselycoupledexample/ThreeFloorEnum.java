package highlycohesivelooselycoupledexample;

public enum ThreeFloorEnum implements IFloor {
    GROUND(0), FIRST_FLOOR(1), SECOND_FLOOR(2), THIRD_FLOOR(3);

    final int floorNumber;

    private ThreeFloorEnum(int floorNumber) {
      this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
      return floorNumber;
    }
  }