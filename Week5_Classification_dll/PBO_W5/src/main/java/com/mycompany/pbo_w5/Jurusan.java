package com.mycompany.pbo_w5;

public class Jurusan {
    private String namaJurusan;

    // Constructor Jurusan
    public Jurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    // Getter dan Setter
    public String getNamaJurusan() { return namaJurusan; }
    public void setNamaJurusan(String namaJurusan) { this.namaJurusan = namaJurusan; }

    // Method untuk menampilkan nama jurusan
    public void displayInfo() {
        System.out.println("Jurusan: " + namaJurusan);
    }
}