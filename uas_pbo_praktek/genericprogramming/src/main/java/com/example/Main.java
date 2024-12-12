package com.example;

// Main Class
// Main Class
public class Main {
    public static void main(String[] args) {
        // Buat objek FullTimeEmployee dengan ID Integer
        FullTimeEmployee<Integer> fullTimeEmployee = new FullTimeEmployee<>(1001, "Alice", 10000000.0);

        // Buat objek PartTimeEmployee dengan ID String
        PartTimeEmployee<String> partTimeEmployee = new PartTimeEmployee<>("PT2025", "Bob", 75000.0, 50);

        // Panggil metode calculatePayment() dan displayDetails()
        System.out.println("FullTimeEmployee Payment: " + fullTimeEmployee.calculatePayment());
        fullTimeEmployee.displayDetails();

        System.out.println("PartTimeEmployee Payment: " + partTimeEmployee.calculatePayment());
        partTimeEmployee.displayDetails();
    }
}
