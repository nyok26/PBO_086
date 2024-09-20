package com.mycompany.pbo_w5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dosen
        Dosen dosen1 = new Dosen("Dr. Budi Santoso", "197812345678", "Ketua Program Studi");
        Dosen dosen2 = new Dosen("Prof. Siti Aisyah", "198011234567", "Guru Besar");
        Dosen dosen3 = new Dosen("Ir. Rudi Hartanto", "197903456789", "Dekan");
        Dosen dosen4 = new Dosen("Dr. Lina Wijaya", "198512345678", "Dosen Senior");
        Dosen dosen5 = new Dosen("Prof. Andi Wijaya", "196712345678", "Dosen Tamu");

        // Membuat objek ruangan
        Ruangan ruangan1 = new Ruangan("Lab Informatika 1", "Gedung A Lantai 3");
        Ruangan ruangan2 = new Ruangan("Ruang Kuliah 205", "Gedung B Lantai 2");
        Ruangan ruangan3 = new Ruangan("Aula", "Gedung C Lantai 1");
        Ruangan ruangan4 = new Ruangan("Lab Komputer 3", "Gedung A Lantai 4");
        Ruangan ruangan5 = new Ruangan("Ruang Seminar", "Gedung B Lantai 1");

        // Membuat daftar jadwal perkuliahan
        List<Jadwal> jadwalKuliah = new ArrayList<>();

        // Senin
        jadwalKuliah.add(new Jadwal("Senin", "Algoritma dan Pemrograman", ruangan1, dosen1));
        jadwalKuliah.add(new Jadwal("Senin", "Matematika Diskrit", ruangan2, dosen2));

        // Selasa
        jadwalKuliah.add(new Jadwal("Selasa", "Struktur Data", ruangan3, dosen3));
        jadwalKuliah.add(new Jadwal("Selasa", "Sistem Operasi", ruangan4, dosen4));

        // Rabu
        jadwalKuliah.add(new Jadwal("Rabu", "Jaringan Komputer", ruangan1, dosen1));
        jadwalKuliah.add(new Jadwal("Rabu", "Komputer Grafik", ruangan5, dosen2));

        // Kamis
        jadwalKuliah.add(new Jadwal("Kamis", "Basis Data", ruangan2, dosen3));
        jadwalKuliah.add(new Jadwal("Kamis", "Pemrograman Berorientasi Objek", ruangan3, dosen4));

        // Jumat
        jadwalKuliah.add(new Jadwal("Jumat", "Kecerdasan Buatan", ruangan4, dosen5));
        jadwalKuliah.add(new Jadwal("Jumat", "Sistem Informasi", ruangan5, dosen1));

        // Menampilkan jadwal perkuliahan
        System.out.println("Jadwal Perkuliahan Senin - Jumat:");
        for (Jadwal jadwal : jadwalKuliah) {
            jadwal.displayJadwal();
            System.out.println(); // Jarak antar jadwal
        }
    }
}
