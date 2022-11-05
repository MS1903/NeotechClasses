package com.neotech.lesson05;

public class Task1 {

	public static void main(String[] args) {

		// Write a program. Create a variable day ( 1 - 7)
		// For every weekday, print "Today is Monday and we are working."
		// For weekend, print "We are on a break on Weekend."

		int day = 6;

		if (day == 1) {

			System.out.println("Today is Monday and we are Working");
		}

		else if (day == 2) {

			System.out.println("Today is Tuesday and we are Working");
		}

		else if (day == 3) {

			System.out.println("Today is Wednesday and we are Working");
		}

		else if (day == 4) {

			System.out.println("Today is Thursday and we are Working");
		}

		else if (day == 5) {

			System.out.println("Today is Friday and we are Working");
		}

		

		else {

			System.out.println("We are at break on weekends.");
			
		}

	}

}
