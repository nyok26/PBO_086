/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task3_1;

/**
 *
 * @author b
 */
public class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    // Constructor untuk Employee
    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    // Implementasi metode compare untuk membandingkan gaji
    @Override
    public int compare(Sortable b) {
        Employee otherEmployee = (Employee) b;
        if (this.salary < otherEmployee.salary) return -1;
        if (this.salary > otherEmployee.salary) return 1;
        return 0;
    }

    // Method untuk menaikkan gaji
    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    // Method untuk print data Employee
    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    // Method untuk mendapatkan tahun hire
    public int hireYear() {
        return hireyear;
    }
}

