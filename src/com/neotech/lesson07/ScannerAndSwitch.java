package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {

//ask the user about their country and the print language they speak.
		Scanner scan = new Scanner(System.in);

		String country;
		// escape character \n -- new line // \t adds more space TAB

		System.out.println("Where are you from?");

		country = scan.next();

		if (country.equals("Albania")) {
			System.out.println("You speak Albanian!");
		} else if (country.equals("Turkiye")) {
			System.out.println("You speak Turkish!");

		} else if (country.equals("USA") || country.equals("UK")) {
			System.out.println("You speak English");
		} else {
			System.out.println("I dont know what language you speak!");
		}
//same task using Switch
		switch (country) {
		case "Turkiye":
			System.out.println("You speak Turkish!");
			break;
		case "Ecuador":
		case "Spain":
			System.out.println("You speak Spanish");
			break;

		case "USA":
		case "UK":
			System.out.println("You speak English");
			break;

		default:
			System.out.println("I dont know what language you speak!");
			break;

		}

	}
}
