package com.example;

// Kelas abstrak Employee<T>
abstract class Employee<T> {
    protected T id;
    protected String name;

    public Employee(T id, String name) {
        this.id = id;
        this.name = name;
    }

    // Metode abstrak untuk menghitung pembayaran
    public abstract double calculatePayment();

    // Menampilkan detail karyawan
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
