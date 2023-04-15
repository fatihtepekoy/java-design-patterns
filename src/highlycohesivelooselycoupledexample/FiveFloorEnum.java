package highlycohesivelooselycoupledexample;

public enum FiveFloorEnum implements IFloor {
    ENTRANCE(0), FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5);

    final int floorNumber;

    private FiveFloorEnum(int floorNumber) {
      this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
      return floorNumber;
    }
  }