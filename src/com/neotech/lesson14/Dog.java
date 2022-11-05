package com.neotech.lesson14;

public class Dog {

//	Create a class Dog
//    features: breed, size, color and age
//    behaviors: eat(), run(), breed()
	String name;
	String breed;
	String size;
	String color;
	int age;

	void eat() {
		System.out.println(name + " " + "loves to eat!");
	}

	void run() {
		System.out.println(name + " " + "runs very fast!");

	}

	void barking() {
		System.out.println(name + " " + "barks a lot when she is angry!");
	}
}
