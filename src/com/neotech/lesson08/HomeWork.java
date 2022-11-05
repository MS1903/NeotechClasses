package com.neotech.lesson08;

public class HomeWork {

	public static void main(String[] args) {
		// 1. Write a program using while loop that calculates the sum of the even
		// numbers between 0 and 10.

		int num = 2;
		int sum = 0;

		while (num <= 10) {

			if (num % 2 == 0)

			{
				sum += num;
			}
			num++;

		}
		System.out.println("The sum of the even numbers between 0 and 10 is : " +sum );

	}

}
