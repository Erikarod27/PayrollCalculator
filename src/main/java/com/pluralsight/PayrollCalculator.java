package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //get first name
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        //get last name
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        //get hours worked
        System.out.print("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();
        //get pay rate
        System.out.print("Enter pay rate: ");
        float payRate = scanner.nextFloat();
        float grossPay = hoursWorked * payRate;
        System.out.printf("%s %s's gross pay is: %.2f", firstName, lastName, grossPay);
    }
}
