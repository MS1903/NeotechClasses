package com.neotech.lesson06;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare a number
		
		int number = 0;
		
		// check if the number is between 1 and 10
		if(number >=1 && number <= 10)
		{
			System.out.println("It is a small number");
			
		} else if (number>=11 && number <= 101)
		{
			System.out.println("It is a medium number");
		} else if (number>=101 && number <= 1000) {
			System.out.println("It is a large number");
		}else {
			System.out.println( number + " is out of range");
	
		}
		
	}

}
