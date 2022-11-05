package com.neotech.lesson17;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * You have a String a = "Is it Saturday? Is it raining? Do we have a Java Class
		 * today?" How would you find out how many sentences are in that String?
		 * 
		 * If you find this easy: "Is it Saturday! Is it raining? Do we have a Java
		 * Class today."
		 */

		System.out.println("\"Mustafa\"");

		String sentence = "Is it Saturday? Is it raining? Do we have a Java Class today?";

		String[] array = sentence.split("\\?");

		System.out.println("Array length is " + array.length);

		String s2 = sentence.replaceAll("[?]", "+");

		System.out.println(s2);

	}

}
