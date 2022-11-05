package com.neotech.lesson14;

public class DogBecomeHuman {

	public static void main(String[] args) {
		Dog d1 = new Dog();

		d1.name = "Diva";
		d1.color = "Brown";
		d1.breed = "Golden Retriever";
		d1.size = "Big";
		d1.age = 2;

		d1.run();
		d1.eat();
		d1.barking();

	}

}
