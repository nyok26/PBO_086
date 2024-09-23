package com.mycompany.pbo_w5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dosen
        Dosen dosen1 = new Dosen("Yadhi Aditya P.", "KO052N");
        Dosen dosen2 = new Dosen("Yudi Widhiyasana", "KO013N");
        Dosen dosen3 = new Dosen("Suprihanto", "KO022N");
        Dosen dosen4 = new Dosen("Trisna Gelar A", "KO078N");
        Dosen dosen5 = new Dosen("Ade Chandra Nugraha", "KO001N");
        Dosen dosen6 = new Dosen("Muhammad Rizqi S", "KO074N");
        Dosen dosen7 = new Dosen("Santi Sundari", "KO009N");
        Dosen dosen8 = new Dosen("Santi Sundari", "KO009N");
        Dosen dosen9 = new Dosen("Ade Hodijah", "KO060N");
        Dosen dosenproyek = new Dosen("Zulkifli Arsyad", "KO061N");

        // Membuat objek ruangan
        Ruangan D217 = new Ruangan("D217-Kelas");
        Ruangan D101 = new Ruangan("D101-Kelas");
        Ruangan D102 = new Ruangan("D102-Lab. MT");
        Ruangan D106 = new Ruangan("D106-Lab. SDB");
        Ruangan ruangan5 = new Ruangan("Ruang Seminar");

        // Membuat daftar jadwal perkuliahan
        List<Jadwal> jadwalKuliah = new ArrayList<>();

        // Senin
        jadwalKuliah.add(new Jadwal("Senin","08.40-09.30", "Pemrograman Berorientasi Objek", "21IF2011", D217, dosen1));
        jadwalKuliah.add(new Jadwal("Senin", "10.40-12.20", "Komputer Grafik", "21IF2015", D217, dosen2));
        jadwalKuliah.add(new Jadwal("Senin", "13.00-15.30", "Matematika Diskrit II", "21IF2010", D217, dosen3));
        jadwalKuliah.add(new Jadwal("Senin", "15.50-18.20", "Komputer Grafik", "21IF2015", D217, dosen4));

        // // Selasa
        jadwalKuliah.add(new Jadwal("Selasa", "07.00-08.40", "Basis Data", "21IF2012", D101, dosen5));
        jadwalKuliah.add(new Jadwal("Selasa", "08.40-10.40", "Aljabar Linier", "21IF2014", D101, dosen6));
        jadwalKuliah.add(new Jadwal("Selasa", "10.40-12.20", "Pengantar Rekayasa Perangkat Lunak", "21IF2013", D101, dosen7));

        // // Rabu
        jadwalKuliah.add(new Jadwal("Rabu", "07.00-16.40", "Proyek 3: Pengembangan Perangkat Lunak Berbasis Web", "21IF2016", D102, dosenproyek));

        // // Kamis
        jadwalKuliah.add(new Jadwal("Kamis", "09.50-15.30", "Pengantar Rekayasa Perangkat Lunak", "21IF2013", D106, dosen1));
        jadwalKuliah.add(new Jadwal("Kamis", "15.50-18.20", "Pemrograman Berorientasi Objek", "21IF2011", D106, dosen8));

        // // Jumat
        jadwalKuliah.add(new Jadwal("Jumat", "07.00-13.50", "Basis Data", "21IF2012", D106, dosen9));
        

        // Menampilkan jadwal perkuliahan
        System.out.println("Jadwal Perkuliahan Senin - Jumat:");
        for (Jadwal jadwal : jadwalKuliah) {
            jadwal.displayJadwal();
            System.out.println(); // Jarak antar jadwal
        }
    }
}
