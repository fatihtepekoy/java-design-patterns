package designpatterns.behavioral.state;

public class PauseState extends State {

  private final Player player;

  PauseState(Player player) {
    super(player);
    this.player = player;
  }

  public String play() {
    player.changeState(new PlayState(player));
    return player.startPlaying();
  }

  public String stop() {
    player.changeState(new StopState(player));
    return player.stopPlaying();
  }

  public String pause() {
    player.changeState(new PauseState(player));
    return "Player already paused!!!";
  }


}
