package com.mycompany.employee;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // Konstruktor
    public Commission(String name, String address, String phone, String socialSecurityNumber, double payRate, double commissionRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.commissionRate = commissionRate;
        this.totalSales = 0; // Inisialisasi dengan 0
    }

    // Metode untuk menambahkan total penjualan
    public void addSales(double sales) {
        totalSales += sales;
    }

    // Override metode pay untuk menghitung gaji ditambah komisi
    @Override
    public double pay() {
        double payment = super.pay() + (commissionRate * totalSales);
        totalSales = 0; // Reset totalSales setelah pembayaran
        return payment;
    }

    // Override metode toString untuk menampilkan informasi tambahan
    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: $" + totalSales;
    }
}

