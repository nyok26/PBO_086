/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2_1;

/**
 *
 * @author b
 */
public class Circle extends Shape {
    private double radius;

    // No-arg constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor dengan radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor dengan radius, color, dan filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Memanggil constructor dari superclass Shape
        this.radius = radius;
    }

    // Getter dan Setter untuk radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method untuk menghitung luas
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method untuk menghitung keliling
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
