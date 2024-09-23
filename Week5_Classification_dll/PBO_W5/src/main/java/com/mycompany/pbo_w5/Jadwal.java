package com.mycompany.pbo_w5;

public class Jadwal {
    private String jam;
    private String hari;
    private String mataKuliah;
    private String kodeMatkul;
    private Ruangan ruangan;
    private Dosen dosen;

    // Constructor
    public Jadwal(String hari, String jam, String mataKuliah, String kodeMatkul, Ruangan ruangan, Dosen dosen) {
        this.hari = hari;
        this.jam = jam;
        this.mataKuliah = mataKuliah;
        this.kodeMatkul = kodeMatkul;
        this.ruangan = ruangan;
        this.dosen = dosen;
    }

    // Method untuk menampilkan jadwal
    public void displayJadwal() {
        System.out.println("Hari: " + hari);
        System.out.println("Jam-ke: " + jam);
        System.out.println("Kode Matkul: " + kodeMatkul);
        System.out.println("Mata Kuliah: " + mataKuliah);
        ruangan.displayRuangan();
        dosen.displayInfo();
        
    }
}

