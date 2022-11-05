package com.neotech.lesson08;

public class IntroToDoWhileLoop {

	public static void main(String[] args) {

		
		int num1 = 5; 
		
		//while loop: 
		// check the condition
		//if the condition is false, then we do not check again
		//if the condition is true, we keep executing and checking until it becomes false
		while(num1 >= 15)
		{
			System.out.print(num1 + " ");
			
			num1++;
		}
		
		System.out.println();
		
		
		// Using Do.. while
		int num2 = 5;
		
		//Do while loop:
		//first execute the body once
		//then check the condition
		//if the condition is false, then do not run anymore
		//if the condition is true, then continue executing until it becomes false
		do
		{
			System.out.print(num2 + " ");
			
			num2++; 
			
		}while(num2 >= 15);
		
		/*
		 * Create a boolean variable workDay and assign true create int variable day and
		 * assign it to 1 - As long as it is workDay print "I need a day off" and
		 * increase day. - Once day is 6 print "I do not need a day off any more"
		 */
	
	
		boolean workDay = true;
		int day = 1;
		
		while(workDay)  
		{
			if (day < 6)
			{
				System.out.println("I need a day off!");
			
			}
			else 
			{
				System.out.println("I don't need a day off anymore!");
				workDay = false;
				
			}
			
			day++;
		}
		
	}

}