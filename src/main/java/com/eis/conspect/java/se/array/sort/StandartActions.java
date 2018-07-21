package com.eis.conspect.java.se.array.sort;

public class StandartActions {
	
	
	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}
	
	public static int[] randomArr(int size){
		int[] newArray = new int[size];
		for (int i = 0; i < size; i++){
			newArray[i] = (int)(Math.random()*100);
		}
		return newArray;
	}
	
	public static void swap (int[] array, int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
