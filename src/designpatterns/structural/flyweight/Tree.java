package designpatterns.structural.flyweight;

public class Tree {

  private TreeType treeType;
  private int x;
  private int y;

  public Tree(TreeType treeType, int x, int y) {
    this.treeType = treeType;
    this.x = x;
    this.y = y;
  }

  public TreeType getTreeType() {
    return treeType;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}
