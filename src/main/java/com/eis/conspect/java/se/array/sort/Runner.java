package com.eis.conspect.java.se.array.sort;
import static com.eis.conspect.java.se.array.sort.Sort.bubbleSort;
import static com.eis.conspect.java.se.array.sort.Sort.selectedSort;
import static com.eis.conspect.java.se.array.sort.StandartActions.printArray;
import static com.eis.conspect.java.se.array.sort.StandartActions.randomArr;

public class Runner {

	public static void main(String[] args) {

		int[] array = randomArr(23);
		printArray(array);
		
		bubbleSort(array);
		printArray(array);
		
		selectedSort(array);
		printArray(array);
	}
}
