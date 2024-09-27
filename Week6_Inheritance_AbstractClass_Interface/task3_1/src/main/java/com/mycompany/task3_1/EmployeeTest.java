/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task3_1;

/**
 *
 * @author b
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan objek Employee dan Manager
        Employee[] staff = new Employee[3];

        // Inisialisasi objek Employee dan Manager
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Menaikkan gaji semua staf
        for (int i = 0; i < 3; i++) {
            staff[i].raiseSalary(5); // Semua karyawan mendapatkan kenaikan 5%
        }

        // Lakukan shell sort berdasarkan gaji
        Sortable.shell_sort(staff);

        // Mencetak informasi karyawan setelah sorting
        for (int i = 0; i < 3; i++) {
            staff[i].print(); // Cetak informasi setiap karyawan
        }
    }
}

