package com.mycompany.polymorphicsorting;

public class Salesperson implements Comparable<Salesperson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public Salesperson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public int getTotalSales() {
        return totalSales;
    }

    @Override
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return Integer.compare(other.totalSales, this.totalSales); // Urutan menurun
        } else {
            return other.lastName.compareTo(this.lastName); // Urutan abjad terbalik
        }
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }

    
}
