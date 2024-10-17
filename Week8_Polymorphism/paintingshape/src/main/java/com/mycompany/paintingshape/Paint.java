package com.mycompany.paintingshape;

public class Paint {
    private double coverage; // Coverage per unit area

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s.toString());
        return s.area() / coverage;
    }
}

