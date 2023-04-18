package designpatterns.structural.flyweight;

import java.awt.Color;
import java.util.Random;

public class ForestTest {

  private static final int CANVAS_SIZE = 500;

  public static void main(String[] args) {
    Forest forest = new Forest();
    for (int i = 0; i < CANVAS_SIZE*2; i++) {
      forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Coconut", Color.GRAY );
      forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Papaya", Color.GREEN );
      forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Ginko", Color.BLUE );
    }
    forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
    forest.setVisible(true);

  }

  private static int random(int min, int max) {
    return min + (int) (Math.random() * ((max - min) + 1));
  }

}
