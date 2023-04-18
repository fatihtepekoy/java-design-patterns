package designpatterns.structural.composition;

public class Bird implements Animal{

  private String name;

  public Bird(String name) {
    this.name = name;
  }

  @Override
  public void printFamily() {
    System.out.println("bird family");
  }
}
