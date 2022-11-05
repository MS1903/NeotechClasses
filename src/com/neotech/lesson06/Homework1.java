package com.neotech.lesson06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * // 1. Ask the user to enter the height in inches. 
		 * Person should be classified as one of the following: 
		 * • short (under 60 inch) • medium (between 60 -72inch) • tall (over 72 inch)
		 */

		Scanner input = new Scanner(System.in);
		//ask user to enter their height
		System.out.println("Please enter your height in inches:");
		double height = input.nextDouble();
		if(height <60) {
			System.out.println("You are classified as short.");
			if(height>60 && height>72)
			{
				System.out.println("You are classified as medium." );
			}
			if (height>72) {
				System.out.println("You are classified as tall.");
			}
		}
	}
	

}
