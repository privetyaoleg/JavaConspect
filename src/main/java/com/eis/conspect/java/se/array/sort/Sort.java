package com.eis.conspect.java.se.array.sort;

import java.util.Arrays;

import static com.eis.conspect.java.se.array.sort.StandartActions.swap;

public class Sort {
    public static void main(String[] args) {



    }

    // SORT

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }


    public static void selectedSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int indexMin = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }

            swap(array, i, indexMin);

        }
    }


}
