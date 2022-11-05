package com.neotech.review05;

public class FamilyDemo {

	public static void main(String[] args) {

		// I CAN access static/class variables before I create an object
		FamilyMembers.lastName = "James";

		// I CANNOT access instance variables before I create an object
		// FamilyMembers.firstName = "LeBron";

		// I CAN access static/class methods before I create an object
		FamilyMembers.printFamilyName();

		// I CANNOT access non-static method before I create an object
		// FamilyMembers.printFullName();

		System.out.println("--------------------------------");

		FamilyMembers member1 = new FamilyMembers();
		member1.firstName = "LeBron";
		member1.age = 37;

		FamilyMembers member2 = new FamilyMembers();
		member2.firstName = "Savannah";
		member2.age = 35;

		member1.printFullName();
		member2.printFullName();

		System.out.println("--------------------------------");
		System.out.println("They went to the court and changed their lastname!!!");

		// Static varibles CAN change
		FamilyMembers.lastName = "Brown";
		member1.firstName = "King LeBron";

		member2.printFullName();
		member1.printFullName();

		// They had a baby
		FamilyMembers baby = new FamilyMembers();

		// Does this baby has a firstName?
		System.out.println("firstName-> " + baby.firstName);

		// Does this baby has a lastName?
		System.out.println("lastName-> " + FamilyMembers.lastName);

	}

}