/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3_praktikum;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author b
 */
public class soal6 {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input
        Scanner sc = new Scanner(System.in);

        // Menampilkan pesan agar pengguna memasukkan angka
        System.out.println("Masukkan dua angka besar yang dipisahkan oleh enter:");

        // Membaca dua angka besar sebagai string dan mengonversinya menjadi BigInteger
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());

        // Menghitung hasil penjumlahan
        BigInteger sum = a.add(b);

        // Menghitung hasil perkalian
        BigInteger product = a.multiply(b);

        // Menampilkan hasil penjumlahan dan perkalian
        System.out.println(sum);       // Output hasil penjumlahan
        System.out.println(product);    // Output hasil perkalian

        // Menutup scanner
        sc.close();
    }
}
