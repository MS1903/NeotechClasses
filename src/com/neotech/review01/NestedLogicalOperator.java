package com.neotech.review01;

import java.util.Scanner;

public class NestedLogicalOperator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter your gender:");

		char gender = scan.next().charAt(0);
		
		System.out.println("Are you rich?(True or False)");
		
		boolean rich =scan.nextBoolean();
		
		if(gender == 'M' && rich)
		{System.out.println("Buy a Ferrari");
	
		}else if (gender == 'M' && !rich)
		{
			System.out.println("Play soccer.");
		}else if(gender == 'F' && rich)
		{System.out.println("Buy a LV bag");
		}else if(gender == 'F' && !rich)
		{
			System.out.println("Read a book!");
		}
		else 
		{
			System.out.println("Invalid Gender!");
		}
}}
