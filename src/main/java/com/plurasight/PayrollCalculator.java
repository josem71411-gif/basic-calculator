package com.plurasight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Ask for employee name
        System.out.print("Enter employyee name: ");
        String employeeName = input.nextLine();

// Asking for hours worked
        System.out.print("Enter hours Worked: ");
        double hoursWorked = input.nextDouble();

// Asks for pay rate
        System.out.print("Enter pay rate: ");
        double payRate = input.nextDouble();
// Calculate gross pay
        double grossPay = hoursWorked * payRate;





    }
}
