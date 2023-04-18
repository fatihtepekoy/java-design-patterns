package designpatterns.structural.composition;

import java.util.ArrayList;
import java.util.List;

public class ZooGarden implements Animal{

  private String name;

  private List<Animal> animals;

  public ZooGarden(String name) {
    this.name = name;
    this.animals = new ArrayList<>();
  }

  public void printFamily() {
    animals.forEach(Animal::printFamily);
  }

  public void addAnimal(Animal animal) {
    animals.add(animal);
  }

  public void removeAnimal(Animal animal) {
    animals.remove(animal);
  }
}

