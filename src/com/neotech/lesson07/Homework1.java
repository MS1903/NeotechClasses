package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// Allow user to enter grade and then provide explanation:A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		//At the end your program should print which grade was entered by a user with explanation.

		String grade;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grade:");
		grade =input.next();
		
		switch(grade) {
		case "A":
			System.out.println("Excellent!");
			break;
		case "B":
			System.out.println("Good!");
			break;
		case "C":	
			System.out.println("Average!");
			break;
		case "D":
			System.out.println("Bad!");
			break;
		default: 
			System.out.println("Not acceptable!");
		}
		
		
		
	}

}
