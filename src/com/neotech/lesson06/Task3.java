package com.neotech.lesson06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// Write a program that asks user to enter two
		// numbers and prints which one is larger
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int firstNumber = input.nextInt();

		// ask user for the second number
		System.out.println("Enter the second number:");
		int secondNumber = input.nextInt();
//Compare two Numbers
		if (firstNumber > secondNumber) {
			System.out.println(firstNumber + "is greater than " + secondNumber);

		} else if( firstNumber==secondNumber)  {
			System.out.println(firstNumber + " less than " + secondNumber);

		}else {
		//first number is less than second number
			System.out.println(firstNumber + " is less than " + secondNumber);
			
		}

	}

}
