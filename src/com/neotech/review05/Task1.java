package com.neotech.review05;

public class Task1 {

	public static void main(String[] args) {

		String longStr = "I am very happy today, because today is not Monday";
		System.out.println(longStr);
		System.out.println();

		char[] charArray = longStr.toCharArray();

		for (char el : charArray) {
			if (el == 'a')
				System.out.print('e');
			else {
				System.out.print(el);
			}

		}

	}

}
