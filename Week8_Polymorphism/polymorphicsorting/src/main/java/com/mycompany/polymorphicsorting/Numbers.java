package com.mycompany.polymorphicsorting;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        int n = scanner.nextInt();
        
        Integer[] numbers = new Integer[n];
        System.out.println("Masukkan angka:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt(); // Autoboxing int ke Integer
        }

        Sorting.selectionSort(numbers);
        
        System.out.println("Array setelah diurutkan:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

