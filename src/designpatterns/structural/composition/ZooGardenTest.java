package designpatterns.structural.composition;

public class ZooGardenTest {

  public static void main(String[] args) {
    Animal bird = new Bird("Sam");
    Animal human = new Mammal("Fatih");

    ZooGarden myZooGarden = new ZooGarden("MyZooGarden");
    myZooGarden.addAnimal(bird);
    myZooGarden.addAnimal(human);

    // we call same methods, does not matter single or composite
    bird.printFamily();

    System.out.println("-----");
    myZooGarden.printFamily();

  }

}

