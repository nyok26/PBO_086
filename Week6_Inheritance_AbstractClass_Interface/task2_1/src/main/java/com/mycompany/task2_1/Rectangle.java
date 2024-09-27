/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2_1;

/**
 *
 * @author b
 */
public class Rectangle extends Shape {
    private double width;
    private double length;

    // No-arg constructor
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor dengan width dan length
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Constructor dengan width, length, color, dan filled
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter dan Setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Method untuk menghitung luas
    public double getArea() {
        return width * length;
    }

    // Method untuk menghitung keliling
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override toString() method
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}

