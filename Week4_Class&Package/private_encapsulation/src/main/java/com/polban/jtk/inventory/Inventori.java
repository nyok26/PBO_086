/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polban.jtk.inventory;

/**
 *
 * @author b
 */
public class Inventori {
    Barang[] barangs;

    // Inisialisasi objek barang
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    // Menampilkan data barang
    void showBarang() {
        System.out.println(barangs[0].getNamaBarang() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + "(" + barangs[1].getStok() + ")");
    }

    // Pengadaan barang dengan hanya bisa menambah stok
    void pengadaan() {
        initBarang();
        // Tambah stok dengan cara yang benar menggunakan setter
        barangs[0].tambahStok(20);

        // Tampilkan stok barang setelah pengadaan
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
