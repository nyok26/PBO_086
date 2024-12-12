package com.example;

// Kelas turunan FullTimeEmployee<T>
class FullTimeEmployee<T> extends Employee<T> {
    private double monthlySalary;

    public FullTimeEmployee(T id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePayment() {
        // Implementasi untuk menghitung pembayaran gaji bulanan
        return monthlySalary;
    }
}
