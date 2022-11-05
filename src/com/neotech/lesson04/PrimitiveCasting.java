package com.neotech.lesson04;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		double d1 = 3.7;
		
		System.out.println(d1);
		
		double d2 = 6;  //casting is happening.
		
		System.out.println(d2);
		//widening, implicit, automatically. (Process name)
		int num1 = 5;
		double d3= num1;
		System.out.println(d3);
		
		//int num2 = 6.3;
		//Narrowing process from big data type to small datatype
		
		
		int num2 = (int) 6.3;
		System.out.println(num2);
		
		byte b1 = (byte) 3453;
		System.out.println(b1);
		
		int i2 = 45;
		
		byte b2 = (byte) i2;
		
		System.out.println(b2);
		
		long l1 = 17;
		int number1 = (int) l1;
		System.out.println(number1);
		
		long l2 = 8276348264382L;
		int number2 = (int) l2;
		System.out.println(number2);
		
		int number5 = 247;
		
		float f1 = number5;
		
		System.out.println(f1);
		
		
		
		
		
		
		
		

	}

}
