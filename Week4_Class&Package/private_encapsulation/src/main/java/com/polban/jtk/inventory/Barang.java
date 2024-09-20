/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.polban.jtk.inventory;

/**
 *
 * @author b
 */

 public class Barang {
    // Atribut stok dibuat private untuk melindungi akses langsung
    private String kode_barang;
    private String nama_barang;
    private int stok;

    // Konstruktor
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    // Getter untuk mengakses stok
    public int getStok() {
        return stok;
    }

    // Setter untuk menambah stok (hanya bisa menambah stok, tidak ada pengurangan)
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah stok yang ditambahkan harus positif.");
        }
    }

    // Getter untuk nama barang
    public String getNamaBarang() {
        return nama_barang;
    }
}

