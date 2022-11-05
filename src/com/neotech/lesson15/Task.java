package com.neotech.lesson15;

public class Task {

	/*
	 * method1: Create a method that will take 2 parameters as numbers and prints
	 * which number is larger. method2: Create a method that will take a number and
	 * prints whether the number is even or odd. method3: Create a method that will
	 * say Hello in a different language based on the country that will passed when
	 * method is executed.
	 */

	void larger(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger than " + b);
		} else if (b < a) {
			System.out.println(b + " is larger than " + a);

		}
	}

}
