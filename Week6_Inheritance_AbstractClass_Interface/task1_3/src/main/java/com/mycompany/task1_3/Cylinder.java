/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1_3;

/**
 *
 * @author b
 */
public class Cylinder extends Circle {
    private double height;

    // Constructor default
    public Cylinder() {
        super(); // Memanggil constructor default Circle
        this.height = 1.0;
    }

    // Constructor dengan tinggi yang ditentukan
    public Cylinder(double height) {
        super(); // Memanggil constructor default Circle
        this.height = height;
    }

    // Constructor dengan radius dan tinggi yang ditentukan
    public Cylinder(double radius, double height) {
        super(radius); // Memanggil constructor Circle dengan radius
        this.height = height;
    }

    // Menghitung luas permukaan silinder
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Menghitung volume silinder
    public double getVolume() {
        return super.getArea() * height;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + ", height=" + height; // Menampilkan informasi silinder
    }
}

