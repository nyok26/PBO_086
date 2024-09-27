/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task3_1;

/**
 *
 * @author b
 */
public abstract class Sortable {
    // Metode abstrak untuk membandingkan dua objek Sortable
    public abstract int compare(Sortable b);

    // Fungsi statis shell_sort untuk mengurutkan array Sortable
    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Sortable temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
    }
}

