package designpatterns.behavioral.strategy.sorter;

public class SmartSorter {

  public static void sort(int[] array) {
    Sorter sorterStrategy = getTheMostEfficientSorterStrategy(array);
    sorterStrategy.sort(array);
  }

  private SmartSorter() {
  }

  private static Sorter getTheMostEfficientSorterStrategy(int[] list) {
    int size = list.length;

    if(size < 100){
      return new BubbleSorter();
    }
    else if(size < 1_000_000){
      return new QuickSorter();
    }
    else{
      return new JavaSorter();
    }
  }


}
