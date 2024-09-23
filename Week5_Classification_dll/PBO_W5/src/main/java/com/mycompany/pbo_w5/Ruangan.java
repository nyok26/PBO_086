package com.mycompany.pbo_w5;

public class Ruangan {
    private String namaRuangan;

    // Constructor
    public Ruangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

    // Method untuk menampilkan informasi ruangan
    public void displayRuangan() {
        System.out.println("Ruangan: " + namaRuangan);
    }
}

