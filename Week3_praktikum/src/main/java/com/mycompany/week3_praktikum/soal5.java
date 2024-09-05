/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3_praktikum;
import java.util.Scanner;
/**
 *
 * @author b
 */
public class soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan pesan instruksi sebelum membaca input
        System.out.println("Masukkan nomor plat untuk 4 mobil (misalnya: 3555 2333 4555 6660):");

        // Membaca input berupa empat nomor plat mobil
        String plat1 = sc.next();
        String plat2 = sc.next();
        String plat3 = sc.next();
        String plat4 = sc.next();

        // Menggabungkan semua angka dari plat nomor
        String gabunganAngka = plat1 + plat2 + plat3 + plat4;

        // Mengonversi gabungan angka menjadi integer
        long gabunganAngkaLong = Long.parseLong(gabunganAngka);
        
        long hasilKurang = gabunganAngkaLong - 999999;
        boolean dapatBerhenti = (hasilKurang % 5 == 0);

        if (dapatBerhenti) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }

        sc.close();
    }
}
