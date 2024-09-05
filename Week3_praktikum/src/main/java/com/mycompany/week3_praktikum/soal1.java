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
public class soal1 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kata : ");
        String s = sc.nextLine();
                
        String[] tokens = s.split("[^A-Za-z]+");
        
        System.out.println(tokens.length);       
        
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
        
        sc.close();
    }
}
