/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2_1;

/**
 *
 * @author b
 */
public class Square extends Rectangle {

    // Constructor dengan side
    public Square(double side) {
        super(side, side); // Memanggil constructor dari Rectangle
    }

    // Setter untuk width dan length
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // Override toString() method
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}

