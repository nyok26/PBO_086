/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.paintingshape;

 /**
  *
  * @author b
  */

public class Sphere extends Shape {
    private double radius;

    public Sphere(double r)
    {
        super("Sphere");
        radius = r;
    }

    public double area()
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
