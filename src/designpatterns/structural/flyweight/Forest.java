package designpatterns.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Forest extends JFrame {

  private final List<Tree> trees = new ArrayList<>();

  public void plantTree(int x, int y, String name, Color color) {
    TreeType treeType = TreeFactory.getTree(name, color);
    Tree tree = new Tree(treeType, x, y);
    trees.add(tree);
  }

  @Override
  public void paint(Graphics graphics) {
    for (Tree tree : trees) {
      draw(graphics, tree);
    }
  }

  private void draw(Graphics g, Tree tree) {
    g.setColor(Color.BLACK);
    g.fillRect(tree.x() - 1, tree.y(), 3, 5);
    g.setColor(tree.treeType().getColor());
    g.fillOval(tree.x() - 5, tree.y() - 10, 10, 10);
  }


}
