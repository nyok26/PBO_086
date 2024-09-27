/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1_1;

/**
 *
 * @author b
 */
public class Cylinder extends Circle {
    // Private instance variable for height
    private double height;

    // Constructor with default color, radius, and height
    public Cylinder() {
        super(); // Call superclass no-arg constructor (Circle)
        this.height = 1.0; // Default height
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // Call superclass no-arg constructor (Circle)
        this.height = height; // Set the given height
    }

    // Constructor with default color, but given radius and height
    public Cylinder(double radius, double height) {
        super(radius); // Call superclass constructor with radius (Circle)
        this.height = height; // Set the given height
    }

    // A public method for retrieving the height
    public double getHeight() {
        return this.height;
    }

    // A public method for computing the volume of cylinder
    // Use superclass method getArea() to get the base area
    public double getVolume() {
        return getArea() * this.height;
    }
}

