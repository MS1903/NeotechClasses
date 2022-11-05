package com.neotech.review01;

import java.util.Scanner;

public class BreakTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pleae enter your gender:");
	char gender = scan.next().charAt(0);
	
	System.out.println("Are you rich?(true/false");

	boolean rich = scan.nextBoolean();
	
	if(gender == 'M') {
		System.out.println("Yaay, it is a boy!");
		if(rich)
		{
			System.out.println("Buy a Ferrari!");
		}else {
			System.out.println("Play soccer!");
		}
	}else if (gender == 'F') {
		System.out.println("Oh no it's a girl!");
		if(rich) {
			System.out.println("Buy a LV bag!");
			
		}else {
			System.out.println("Read a book!");
		}
	}
	else {
		System.out.println("Invalid gender!");
	}
		
	}
	

}


