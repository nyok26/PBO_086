package com.mycompany.paintingshape;

public class PaintThings {
    public static void main(String[] args) {
        Paint paint = new Paint(350); // Coverage per unit area

        // Instantiate shape objects
        Rectangle deck = new Rectangle("Deck", 20, 35);
        Sphere bigBall = new Sphere(15); // hanya radius
        Cylinder tank = new Cylinder("Tank", 10, 30);

        // Compute amount of paint needed
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        // Print results
        System.out.printf("Paint needed for %s: %.2f%n", deck.toString(), deckAmt);
        System.out.printf("Paint needed for %s: %.2f%n", bigBall.toString(), ballAmt);
        System.out.printf("Paint needed for %s: %.2f%n", tank.toString(), tankAmt);
    }
}


