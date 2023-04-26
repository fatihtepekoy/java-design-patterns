package designpatterns.behavioral.state;

public class StatePatternUITest {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
