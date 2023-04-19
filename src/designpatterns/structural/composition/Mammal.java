package designpatterns.structural.composition;

public class Mammal implements Animal{

  private final String name;

  public Mammal(String name) {
    this.name = name;
  }

  @Override
  public void printFamily() {
    System.out.println("Mammal family");
  }
}
