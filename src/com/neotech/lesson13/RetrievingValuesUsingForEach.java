package com.neotech.lesson13;

public class RetrievingValuesUsingForEach {

	public static void main(String[] args) {

		String[][] animals = { { "cat", "dog", "bird" }, { "tiger", "lion", "bear" }, { "salmon", "seabass", "shrimps" }

		};

		// how to get the row number of rows
		int rows = animals.length;

		// how to get the number of columns for the first row

		int first_row_cols = animals[0].length;
		int second_row_cols = animals[1].length;
		int third_row_cols = animals[2].length;

		// how do we get a specific value, e.g. lion
		String lion = animals[1][1];

		// how to print all values

		for (int row = 0; row < animals.length; row++) {
			for (int col = 0; col < animals[row].length; col++) {

				System.out.print(animals[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
