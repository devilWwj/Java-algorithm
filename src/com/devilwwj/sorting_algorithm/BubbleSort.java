package com.devilwwj.sorting_algorithm;

public class BubbleSort {

    public static void sort(int array[]) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {
                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
