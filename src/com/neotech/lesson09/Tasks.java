package com.neotech.lesson09;

public class Tasks {
	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 100 in 1 line with space Print numbers from 100 to 1
		 * Print even numbers from 20 to 1 (2 ways) Print odd numbers between 20 and 50
		 * (2 ways)
		 */
		
		System.out.println("Print numbers from 1 to 100");
		for(int i = 1; i <= 100;i++)
		{
			System.out.print(i + " ");
		}
		System.out.println("100 to 1");
		for (int b = 100; b >= 1; b--)
		{
			System.out.print(b + " ");
		}
		System.out.println("print numbers from 20 to 1");
		
		for (int c= 20; c>=1; c--)
		{
			if(c %2 ==0)
			{
				System.out.print(c + " ");
			}
		}
		System.out.println();
		
		for (int c=20; c>=1; c-=2)
		{System.out.print(c + " ");
	
			
		}
		System.out.println();
		
		//print odd numbers between 20 and 50
		
		for(int d =20; d<=50; d++)
		{
			if(d %2 ==1) {
				System.out.print(d +" ");
			}
		}
		for(int d=21; d<=50; d+=2)
		{
			System.out.print(d + " ");
			
		}
		
		
		
	}

}
