/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week2_w2;

import java.util.Scanner;
/**
 *
 * @author b
 */
public class stringoperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input string A dan B
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        // 1. Menjumlahkan panjang dari A dan B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2. Mengecek apakah A lebih besar secara leksikografis dibandingkan B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Mengkapitalisasi huruf pertama dari A dan B, lalu mencetaknya
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}
