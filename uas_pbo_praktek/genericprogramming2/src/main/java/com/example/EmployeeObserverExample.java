package com.example;

// Implementasi Observer
class EmployeeObserver<T> implements Observer<T> {
    private final String name;

    public EmployeeObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(T state) {
        System.out.println(name + " menerima notifikasi: " + state);
    }
}

public class EmployeeObserverExample {
    public static void main(String[] args) {
        // Buat Employee sebagai Subject
        Employee<String> employee = new Employee<>();

        // Buat Observer
        Observer<String> hrobserver = new EmployeeObserver<>("HR Department");
        Observer<String> managerObserver = new EmployeeObserver<>("Manager");

        // Daftarkan observer ke Employee
        employee.addObserver(hrobserver);
        employee.addObserver(managerObserver);

        // Ubah state (misalnya nama atau gaji karyawan) dan lihat notifikasi
        employee.setState("Nama berubah menjadi Muhammad Raditya Pradana Ilhami");
        employee.setState("Gaji berubah menjadi 15000000");
    }
}


