package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter your name:");
		
		//declare a new variable to catch the user input
		String name = input.next();
		//Write name on the screen
		System.out.println("Nice to meet you:"+ name);
		
		System.out.println("Please enter your age:");
		//declare integer to catch the users age
		int age = input.nextInt();
		System.out.println("Your age is :" + age);
		
		System.out.println("Please enter your weight:");
		
		double weight = input.nextDouble();
		System.out.println("Your weight is :" + weight);
		
		System.out.println("Do you think it is going to rain today?");
		boolean willRain = input.nextBoolean();
				System.out.println("You think it is going to rain" + willRain);
		
		if (willRain)
		{
			System.out.println("Bring your umbrella with you!");
			
		}else {
			System.out.println("Enjoy the weather!");
			
		}
		
		
		
				
		
	}

}
