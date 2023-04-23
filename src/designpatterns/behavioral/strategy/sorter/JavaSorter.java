package designpatterns.behavioral.strategy.sorter;

import java.util.Arrays;

public class JavaSorter implements Sorter{

	@Override
	public void sort(int[] array) {
		long start = System.currentTimeMillis();
		Arrays.sort(array);
		long end = System.currentTimeMillis();
		System.out.println("Time to sort by JavaSort: " + (end - start) + " ms");
	}

}
