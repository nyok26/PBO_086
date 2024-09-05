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
public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan pesan instruksi sebelum membaca input
        System.out.println("Silakan masukkan dua angka dan sebuah operator matematika.");
        System.out.println("Format input: A operator B");
        System.out.println("Contoh: 5 + 3");

        // Membaca input yang terdiri dari dua angka dan satu operator
        int A = sc.nextInt();
        char operator = sc.next().charAt(0);
        int B = sc.nextInt();

        // Menentukan hasil operasi berdasarkan operator yang diberikan
        int result = 0;
        switch (operator) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                result = A / B;
                break;
            case '%':
                result = A % B;
                break;
            default:
                throw new IllegalArgumentException("Operator tidak valid");
        }

        // Menampilkan hasil operasi
        System.out.println(result);

        sc.close();
    }
}
