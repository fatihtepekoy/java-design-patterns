package designpatterns.behavioral.state;

public class PlayState extends State {

  private final Player player;

  PlayState(Player player) {
    super(player);
    this.player = player;
  }

  public String play() {
    return "Player is already playing!!!";
  }

  public String stop() {
    player.changeState(new StopState(player));
    return player.stopPlaying();
  }

  public String pause() {
    player.changeState(new PauseState(player));
    return player.pause();
  }


}
