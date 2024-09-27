/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1_3;

/**
 *
 * @author b
 */
public class TestCylinder {
    public static void main(String[] args) {
        // Membuat instance Cylinder dengan default
        Cylinder c1 = new Cylinder();
        System.out.println(c1.toString()); // Memanggil toString() untuk c1

        // Membuat instance Cylinder dengan tinggi yang ditentukan
        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2.toString()); // Memanggil toString() untuk c2

        // Membuat instance Cylinder dengan radius dan tinggi yang ditentukan
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3.toString()); // Memanggil toString() untuk c3
    }
}

