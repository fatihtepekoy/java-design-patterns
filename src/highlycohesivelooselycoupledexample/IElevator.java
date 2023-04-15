package highlycohesivelooselycoupledexample;

public interface IElevator {

  public void openDoor() ;

  public void closeDoor() ;

  public void go(IFloor floor);
}