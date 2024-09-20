package com.mycompany.pbo_w5;

public class Prodi extends Jurusan {
    private String namaProdi;

    // Constructor Prodi
    public Prodi(String namaJurusan, String namaProdi) {
        super(namaJurusan);
        this.namaProdi = namaProdi;
    }

    // Getter dan Setter
    public String getNamaProdi() { return namaProdi; }
    public void setNamaProdi(String namaProdi) { this.namaProdi = namaProdi; }

    // Method untuk menampilkan informasi prodi
    @Override
    public void displayInfo() {
        super.displayInfo(); // Menampilkan nama jurusan dari superclass
        System.out.println("Prodi: " + namaProdi);
    }
}
