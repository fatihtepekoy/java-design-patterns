package designpatterns.behavioral.strategy.sorter;


import java.util.Random;

public class SorterStrategyTest {

	private static final Random random = new Random();

	public static void main(String[] args) {

		int[] array = arrayCreator(99);
		SmartSorter.sort(array);

		int[] arrayOneLimit = arrayCreator(100);
		SmartSorter.sort(arrayOneLimit);

		int[] arrayTwo = arrayCreator(999_999);
		SmartSorter.sort(arrayTwo);

		int[] arrayTwoLimit = arrayCreator(1_000_000);
		SmartSorter.sort(arrayTwoLimit);

		int[] arrayThree = arrayCreator(10_000_000);
		SmartSorter.sort(arrayThree);

	}

	private static int[] arrayCreator(int length){
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt();

		return arr;
	}
}