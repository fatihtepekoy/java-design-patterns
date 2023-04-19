package designpatterns.structural.flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

  private static final Map<String, TreeType> treeTypes = new HashMap<>();

  public TreeFactory() {
  }

  public static TreeType getTree(String name, Color color) {
    return treeTypes.computeIfAbsent(name, k -> new TreeType(name, color));
  }
}
