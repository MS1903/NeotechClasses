package com.neotech.review02;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
//		Get input from the user, then based on that print this structure
//		For ex: input = 5
//
//		1
//		22
//		333
//		4444
//		55555
//		4444
//		333
//		22
//		1

		Scanner scan = new Scanner(System.in);

		// Ask the user for a number
		System.out.println("Please enter a number:");
		int input = scan.nextInt();

		// This takes care of the incrementing section
		for (int row = 1; row <= input; row++) {

			for (int col = 0; col < row; col++) {
				System.out.print(row);
			}

			System.out.println();
		}

		// This takes care of the decrementing section
		for (int row = input - 1; row > 0; row--) {
			for (int col = 0; col < row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}

	}

}