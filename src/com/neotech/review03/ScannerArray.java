package com.neotech.review03;

import java.util.Scanner;

public class ScannerArray {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How many numbers do you want to store in the array?");

		int size = input.nextInt();

		// declaring the array

		int[] array = new int[size];

		// read numbers and enter them into the array

		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number:");
			array[i] = input.nextInt();

		}
		// print the numbers from the array
		System.out.println("Let's print the numbers from the array");

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + ",");

			System.out.println("0-----------------------0");

			for (int num : array) {
				System.out.print(num + " ");
			}

		}
	}

}
