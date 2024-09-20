package com.mycompany.pbo_w5;

public class Mahasiswa extends Person {
    private String NIM;
    private Prodi prodi;

    // Constructor Mahasiswa
    public Mahasiswa(String nama, String NIM, Prodi prodi) {
        super(nama);
        this.NIM = NIM;
        this.prodi = prodi;
    }

    // Getter dan Setter
    public String getNIM() { return NIM; }
    public void setNIM(String NIM) { this.NIM = NIM; }
    public Prodi getProdi() { return prodi; }
    public void setProdi(Prodi prodi) { this.prodi = prodi; }

    // Method tambahan untuk menampilkan info mahasiswa
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIM: " + NIM);
        prodi.displayInfo();
    }
}