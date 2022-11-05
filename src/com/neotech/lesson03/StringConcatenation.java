package com.neotech.lesson03;

public class StringConcatenation {
	
	public static void main(String[] args) {
		
		String language = "Java";
		
		System.out.println("I love " + language + " Programming! ! !");

		System.out.println("I love Java Programming! ! !");
		
		String s1 = "I love ";
		String s2 = " programming ! ! !";
		System.out.println(s1 +language + s2);
		
		String s3 = "I am " +  2;
		String s4 = s3 + 5;
		
		System.out.println(s3);
		System.out.println(s4);
		
		String two = "2";
		String four = "4";
		int a =2;
		int b =4;
		
		System.out.println(two+four);
		System.out.println(a +  b);
	    System.out.println(two + b);
	    
	    // Order of operations in a string
	    
	    System.out.println("I have  " + 2 + 4  + " apples!");
	    
	    System.out.println("I have " + (2 + 4) + " apples!");
	    
				
		
		
		
		
				
		
	}

}
