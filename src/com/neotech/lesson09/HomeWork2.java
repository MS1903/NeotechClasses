package com.neotech.lesson09;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// 2. Create a program that will be asking user to apply for a credit card 10
		// times.
		// As soon you get an "yes" from a user program should stop asking.

		Scanner scan = new Scanner(System.in);
		String rightAnswer = "Yes";

		

		for (int c = 1; c <= 10; c++) {
			System.out.println("Would you like to apply for a credit card here(Yes/No)?");
			rightAnswer = scan.next();
			if (rightAnswer.equalsIgnoreCase("Yes")) 
			{
				System.out.println("Please proceed to the next step.");
				break;
			}

		}

	}

}
