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
public class soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan pesan instruksi sebelum membaca input
        System.out.println("Masukkan jumlah penjualan bulan ini:");

        // Membaca jumlah penjualan dari input
        int jumlahPenjualan = sc.nextInt();
        
        // Mendefinisikan variabel gaji pokok dan harga per item
        final int GAJI_POKOK = 500000;
        final int HARGA_ITEM = 50000;
        final int ITEM_MINIMAL = 15;
        final int ITEM_BONUS_MIN = 40;
        final int ITEM_BONUS_MAX = 80;

        // Menghitung total penjualan
        int totalPenjualan = jumlahPenjualan * HARGA_ITEM;
        
        // Inisialisasi gaji akhir
        double gajiAkhir = GAJI_POKOK;

        // Menghitung bonus dan denda berdasarkan jumlah penjualan
        if (jumlahPenjualan < ITEM_MINIMAL) {
            // Denda jika penjualan di bawah 15 item
            int kekurangan = ITEM_MINIMAL - jumlahPenjualan;
            double denda = kekurangan * HARGA_ITEM * 0.15;
            gajiAkhir -= denda;
        } else if (jumlahPenjualan <= ITEM_BONUS_MIN) {
            // Bonus jika penjualan antara 15 dan 40 item
            double bonus = totalPenjualan * 0.10;
            gajiAkhir += bonus;
        } else if (jumlahPenjualan <= ITEM_BONUS_MAX) {
            // Bonus jika penjualan antara 40 dan 80 item
            double bonus = totalPenjualan * 0.25;
            gajiAkhir += bonus;
        } else {
            // Bonus jika penjualan di atas 80 item
            double bonus = totalPenjualan * 0.35;
            gajiAkhir += bonus;
        }

        // Menampilkan gaji akhir
        System.out.println((int) gajiAkhir);

        sc.close();
    }
}
