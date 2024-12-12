package com.example;

import java.text.DecimalFormat;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Buat objek FullTimeEmployee dengan ID Integer
        FullTimeEmployee<Integer> fullTimeEmployee = new FullTimeEmployee<>(1001, "Alice", 10000000.0);

        // Buat objek PartTimeEmployee dengan ID String
        PartTimeEmployee<String> partTimeEmployee = new PartTimeEmployee<>("PT2025", "Bob", 75000.0, 50);

        DecimalFormat decimalFormat = new DecimalFormat("#,###"); // Format dengan pemisah ribuan

        // Panggil metode calculatePayment() dan displayDetails()
        System.out.println("FullTimeEmployee Payment: " + decimalFormat.format(fullTimeEmployee.calculatePayment()));
        fullTimeEmployee.displayDetails();

        System.out.println("PartTimeEmployee Payment: " + decimalFormat.format(partTimeEmployee.calculatePayment()));
        partTimeEmployee.displayDetails();
    }
}
