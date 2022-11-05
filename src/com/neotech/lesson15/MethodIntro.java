package com.neotech.lesson15;

public class MethodIntro {
	// does not return anything
	void greet() {
		System.out.println("Hello");
		System.out.println("How are you?");
		System.out.println("Bye!");

	}

	void greet2(String name) {
		System.out.println("Hello " + name);
		System.out.println("How are you?");
		System.out.println("Bye " + name);
	}

	public static void main(String[] args) {

		MethodIntro obj = new MethodIntro();
		obj.greet();
		obj.greet2("Mertcan");

	}

}
