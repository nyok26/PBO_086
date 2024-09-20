package com.mycompany.pbo_w5;

public class Person {
    private String nama;

    // Constructor Person
    public Person(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    // Method untuk menampilkan informasi umum
    public void displayInfo() {
        System.out.println("Nama: " + nama);
    }
}