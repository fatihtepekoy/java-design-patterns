package designpatterns.behavioral.state;

public class StatePatternTest {

  public static void main(String[] args) {
    Player player = new Player();
    String play = player.getState().play();
    System.out.println("play = " + play);

    String play1 = player.getState().play();
    System.out.println("play1 = " + play1);

    String stop = player.getState().stop();
    System.out.println("stop = " + stop);

    String play2 = player.getState().play();
    System.out.println("play2 = " + play2);

    String pause = player.getState().pause();
    System.out.println("pause = " + pause);

    String pause1 = player.getState().pause();
    System.out.println("pause1 = " + pause1);


  }

}
