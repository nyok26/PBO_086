/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

/**
 *
 * @author b
 */
public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this employee with the specified
    //  information.
    //-----------------------------------------------------------------
    public Employee(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    //-----------------------------------------------------------------
    //  Returns information about an employee as a string.
    //-----------------------------------------------------------------
    public String toString() {
        return super.toString() + "\nSocial Security Number: " + socialSecurityNumber;
    }

    //-----------------------------------------------------------------
    //  Returns the pay rate for this employee.
    //-----------------------------------------------------------------
    public double pay() {
        return payRate;
    }
}

