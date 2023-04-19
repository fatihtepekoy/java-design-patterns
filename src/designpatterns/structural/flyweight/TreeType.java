package designpatterns.structural.flyweight;

import java.awt.Color;

public class TreeType {

  private final String name;
  private final Color color;
  private final String someOtherProperties = "max size, max age etc";


  public TreeType(String name, Color color) {
    this.name = name;
    this.color = color;
  }

  public Color getColor() {
    return color;
  }
}
