package designpatterns.structural.facade;

public class FacadeTest {

  public static void main(String[] args) {
    EngineFacade engineFacade = new EngineFacade();
    engineFacade.startEngine();
    engineFacade.stopEngine();
  }
}
