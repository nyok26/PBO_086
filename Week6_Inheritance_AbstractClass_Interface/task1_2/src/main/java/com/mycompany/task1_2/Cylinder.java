/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1_2;

/**
 *
 * @author b
 */
public class Cylinder extends Circle {
    private double height;

    // Constructor dengan nilai default untuk radius, warna, dan tinggi
    public Cylinder() {
        super(); // Memanggil constructor superclass
        this.height = 1.0; // Tinggi default
    }

    // Constructor dengan tinggi yang ditentukan, dan default radius dan warna
    public Cylinder(double height) {
        super(); // Memanggil constructor superclass
        this.height = height;
    }

    // Constructor dengan radius dan tinggi yang ditentukan, dan default warna
    public Cylinder(double radius, double height) {
        super(radius); // Memanggil constructor superclass dengan radius
        this.height = height;
    }

    // Getter untuk tinggi
    public double getHeight() {
        return this.height;
    }

    // Override metode getArea() untuk menghitung luas permukaan silinder
    @Override
    public double getArea() {
        // Luas Permukaan = 2πrh + 2 * Base Area (2πr^2)
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Definisikan metode getVolume() tanpa anotasi @Override
    public double getVolume() {
        // Volume = Base Area (lingkaran) * tinggi
        return super.getArea() * height;
    }
}


