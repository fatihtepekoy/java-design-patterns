package designpatterns.structural.flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

  static Map<String, TreeType> treeTypes = new HashMap<>();

  public static TreeType getTree(String name, Color color) {
    TreeType treeType = treeTypes.get(name);
    if (treeType == null) {
      treeType = new TreeType(name, color);
      treeTypes.put(name, treeType);
    }
    return treeType;
  }
}
