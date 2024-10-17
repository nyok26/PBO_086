package com.mycompany.polymorphicsorting;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah kata: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Mengambil newline yang tersisa

        String[] words = new String[n];
        System.out.println("Masukkan kata:");

        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        Sorting.selectionSort(words);

        System.out.println("Array setelah diurutkan:");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}


