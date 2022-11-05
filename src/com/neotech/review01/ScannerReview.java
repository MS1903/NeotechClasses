package com.neotech.review01;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your first name:");
		String firstName = scan.next();
		System.out.println("Please enter your last name:");
		String lastName = scan.next();
		
		System.out.println("Your full name is " + firstName + " "+ lastName );
	
		//nextLine.() reads the whole line until enter.
		
		System.out.println("Please enter a long sentence!");
		String str1 = scan.next();
		String str2 = scan.next();
		String str3 = scan.nextLine();
		
				System.out.println("str1 " + str1);
				System.out.println("str2 " + str2);
				System.out.println("str3 " + str3);
	}

}




