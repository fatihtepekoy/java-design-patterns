package designpatterns.behavioral.state;

public class Player {

  private State state;

  public Player() {
    state = new StopState(this);
  }

  public void changeState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public String startPlaying() {
    return "Playing...";
  }

  public String stopPlaying() {
    return "Stopped...";
  }

  public String pause() {
    return "Paused...";
  }

}
