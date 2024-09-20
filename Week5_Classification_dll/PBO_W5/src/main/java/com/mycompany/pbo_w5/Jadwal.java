package com.mycompany.pbo_w5;

public class Jadwal {
    private String hari;
    private String mataKuliah;
    private Ruangan ruangan;
    private Dosen dosen;

    // Constructor
    public Jadwal(String hari, String mataKuliah, Ruangan ruangan, Dosen dosen) {
        this.hari = hari;
        this.mataKuliah = mataKuliah;
        this.ruangan = ruangan;
        this.dosen = dosen;
    }

    // Method untuk menampilkan jadwal
    public void displayJadwal() {
        System.out.println("Hari: " + hari);
        System.out.println("Mata Kuliah: " + mataKuliah);
        ruangan.displayRuangan();
        dosen.displayInfo();
    }
}

