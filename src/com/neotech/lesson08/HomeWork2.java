package com.neotech.lesson08;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {

		// 2. Write a program that asks user to enter his/her username and password
		// until user enters them correctly.
		Scanner scan = new Scanner(System.in);

		String userName;

		int pw;

		boolean input = true;

		System.out.println("Please enter your username:");

		userName = scan.next();

		System.out.println("Please enter your password:");

		pw = scan.nextInt();

		while (input) {
			if (userName.equals("SampiyonBesiktas") && pw == 1903) {
				System.out.println(" Welcome Home " + userName);
				input = false;

			} else {
				System.out.println("Sorry!! You have entered wrong credentials");
				break;
			}
		}
	}
}
