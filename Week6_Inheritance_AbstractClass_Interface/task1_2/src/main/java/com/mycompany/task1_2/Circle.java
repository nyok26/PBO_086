/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1_2;

/**
 *
 * @author b
 */
public class Circle {
    // Private instance variables
    private double radius;
    private String color;

    // Constructor with default values for radius and color
    public Circle() {
        this.radius = 1.0; // Default radius
        this.color = "red"; // Default color
    }

    // Constructor with given radius, default color
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red"; // Default color
    }

    // Constructor with given radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter for radius
    public double getRadius() {
        return this.radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return this.color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate area of the circle
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    // Override toString method to describe the circle
    @Override
    public String toString() {
        return "Circle[radius=" + this.radius + " color=" + this.color + "]";
    }
}
