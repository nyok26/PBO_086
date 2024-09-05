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
public class soal2 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan garis pembuka
        System.out.println("================================");

        // Membaca input baris per baris
        while (sc.hasNext()) {
            String str = sc.next(); // Membaca string
            int num = sc.nextInt(); // Membaca integer

            System.out.printf("%-15s%03d\n", str, num);
        }

        // Menampilkan garis penutup
        System.out.println("================================");

        sc.close();
    }
}
