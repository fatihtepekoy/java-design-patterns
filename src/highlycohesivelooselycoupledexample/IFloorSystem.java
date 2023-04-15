package highlycohesivelooselycoupledexample;

public interface IFloorSystem {

  int compareTo(IFloor floor);

  IFloor getCurrentFlow();

  void increaseCurrentFloor();

  void decreaseCurrentFloor();
}
