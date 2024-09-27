/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2_1;

/**
 *
 * @author b
 */
public class TestShape {
    public static void main(String[] args) {
        // Test kelas Shape
        Shape shape1 = new Shape();
        System.out.println(shape1);
        
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        // Test kelas Circle
        Circle circle1 = new Circle();
        System.out.println(circle1);
        
        Circle circle2 = new Circle(2.0, "yellow", false);
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());

        // Test kelas Rectangle
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1);
        
        Rectangle rect2 = new Rectangle(2.0, 4.0, "red", true);
        System.out.println(rect2);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        // Test kelas Square
        Square square1 = new Square(5.0);
        System.out.println(square1);
    }

}

