package com.neotech.lesson06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * . Write a program that will ask for the day (a number from 1-7). Print
		 * whether it is a weekend or weekday. If any day from 1-5 → output “It is a
		 * weekday” Any day from 6-7 → output “It is a weekend”, Any other day → output
		 * “Invalid day”
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("What day is today? Chose a number between 1 and 7?:");
		int day = input.nextInt();
		if (day >= 1 && day <= 5) {
			System.out.println("It is a weekday!");

		} else if (day >= 6 && day <= 7){
		
			System.out.println("It is a weekend!");
		 }else {
			System.out.println("Invalid day!");}
		
	}
	

}
