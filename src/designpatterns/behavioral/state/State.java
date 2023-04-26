package designpatterns.behavioral.state;

public abstract class State {

  private final Player player;

  State(Player player) {
    this.player = player;
  }

  public abstract String play();
  public abstract String stop();
  public abstract String pause();


}
