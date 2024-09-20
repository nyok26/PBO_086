package com.mycompany.pbo_w5;

public class Ruangan {
    private String namaRuangan;
    private String lokasi;

    // Constructor
    public Ruangan(String namaRuangan, String lokasi) {
        this.namaRuangan = namaRuangan;
        this.lokasi = lokasi;
    }

    // Method untuk menampilkan informasi ruangan
    public void displayRuangan() {
        System.out.println("Ruangan: " + namaRuangan);
        System.out.println("Lokasi: " + lokasi);
    }
}

