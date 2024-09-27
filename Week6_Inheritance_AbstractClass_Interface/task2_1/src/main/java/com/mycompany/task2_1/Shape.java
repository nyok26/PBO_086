/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2_1;

/**
 *
 * @author b
 */
public class Shape {
    private String color;
    private boolean filled;

    // No-arg constructor
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor dengan argumen
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter dan Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // toString() method
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}

