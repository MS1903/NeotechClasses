package com.neotech.lesson13;

public class Task1 {

	public static void main(String[] args) {
		// Create a 2D array of integer
		// type with 3 rows and 4 columns and print all values of the whole array.

		int[][] numbers = { { 5, 7, 8, 9 }, { 1, 3, 5, 7 }, { 7, 8, 9, 2 } };
		for (int row = 0; row < numbers.length; row++) {

			for (int col = 0; col < numbers[row].length; col++) {

				System.out.print(numbers[row][col] + " ");
			}
		}
		System.out.println();
	}

}
