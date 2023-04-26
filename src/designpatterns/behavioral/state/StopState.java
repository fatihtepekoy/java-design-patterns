package designpatterns.behavioral.state;

public class StopState extends State {

  private final Player player;

  StopState(Player player) {
    super(player);
    this.player = player;
  }

  public String play() {
    player.changeState(new PlayState(player));
    return player.startPlaying();
  }

  public String stop() {
    return "Not playing!!!";
  }

  public String pause() {
    return "Not playing!!!";
  }


}
