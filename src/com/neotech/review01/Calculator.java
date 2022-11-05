package com.neotech.review01;

import java.util.Scanner; //THIS LINE MEANS I WANT TO USE SCANNER.

public class Calculator {

	public static void main(String[] args) {
		// Ask the user to enter 2 numbers
		// Ask the user for the operator(+ - * / )
		// Solve it using if-else And using switch

		Scanner kenan = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double d1 = kenan.nextDouble();
		System.out.println("Please enter the second number:");
		double d2 = kenan.nextDouble();

		System.out.println("Please enter the operator(+,-,*,/)");
		

		String operator = kenan.next();
		
		
		if (operator.equals("+")) {
			System.out.println("The result is: " + (d1 + d2));
		} else if (operator.equals("-")) {
			System.out.println("The result is: " + (d1 - d2));
		} else if (operator.equals("*")) {
			System.out.println("The result is: " + (d1 * d2));
		} else if (operator.equals("/")) {
			System.out.println("The result is: " + (d1 / d2));
		} else {
			System.out.println("Invalid operator!");
		}
		
		
			

	}

}
