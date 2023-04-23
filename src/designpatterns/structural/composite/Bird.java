package designpatterns.structural.composite;

public class Bird implements Animal{

  private final String name;

  public Bird(String name) {
    this.name = name;
  }

  @Override
  public void printFamily() {
    System.out.println("bird family");
  }
}
