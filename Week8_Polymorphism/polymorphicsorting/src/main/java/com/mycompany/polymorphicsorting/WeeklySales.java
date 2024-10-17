package com.mycompany.polymorphicsorting;

import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah salesperson: ");
        int numSalespeople = scanner.nextInt();
        scanner.nextLine(); // Ambil newline yang tersisa

        Salesperson[] salespeople = new Salesperson[numSalespeople];

        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Masukkan nama depan: ");
            String firstName = scanner.nextLine();
            System.out.print("Masukkan nama belakang: ");
            String lastName = scanner.nextLine();
            System.out.print("Masukkan total sales: ");
            int totalSales = scanner.nextInt();
            scanner.nextLine(); // Ambil newline

            salespeople[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort(salespeople);

        System.out.println("Salesperson setelah diurutkan:");
        for (Salesperson sp : salespeople) {
            System.out.println(sp);
        }
    }
}


