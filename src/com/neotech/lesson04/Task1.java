package com.neotech.lesson04;

public class Task1 {

	public static void main(String[] args) {
	//	Create a int variable named number1, assign the value of 500.
	//	Store/assign number1 into a byte name number2
	//	Re-assign the number1 into number2.
	//	Print the value of number2. Check if it is 500
	//	What if the initial value was 50?
		
		
		int number1 = 500;
		byte number2 = (byte) number1;
			
		System.out.println(number2);
		
		int num1 = 50;
		byte num2 = (byte) num1;
		
		num1 = num2;
		System.out.println(num2);
		
		

	}

}
