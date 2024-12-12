package com.example;

// Kelas turunan PartTimeEmployee<T>
class PartTimeEmployee<T> extends Employee<T> {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(T id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        // Implementasi untuk menghitung pembayaran berdasarkan jam kerja
        return hourlyRate * hoursWorked;
    }
}

