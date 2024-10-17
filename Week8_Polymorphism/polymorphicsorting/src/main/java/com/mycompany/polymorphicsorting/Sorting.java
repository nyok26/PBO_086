package com.mycompany.polymorphicsorting;

public class Sorting {
    public static void selectionSort(Comparable[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(list[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Comparable temp = list[minIndex];
            list[minIndex] = list[i];
            list[i] = temp;
        }
    }

    public static void insertionSort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].compareTo(key) > 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }
}

