package com.plurasight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Ask for first number
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();
 // Ask for second number
    System.out.print("Enter the second number: ");
    double secondNumber = input.nextDouble();
 // Ask user for operation
 System.out.println("What operation would you like to perform?");
 System.out.println("1. Add");
 System.out.println("2. Subtract");
 System.out.println("3. Multiply");
 System.out.println("4. Divide");

 System.out.print("Enter your choice (1-4): ");
 int choice = input.nextInt();

 //Always multiply (regardless of choice)
  double result = firstNumber * secondNumber;

  // Display result
  System.out.println(("Result: " + result));
  input.close();


    }

}
