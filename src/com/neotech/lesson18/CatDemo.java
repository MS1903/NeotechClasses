package com.neotech.lesson18;

public class CatDemo {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		cat1.name = "Leo";
		cat1.weight = 8;
		cat1.color = "Gray";

		cat1.sayMeow();
		cat1.displayCatInfo();

		Cat cat2 = new Cat();

		cat2.name = "Zia";
		cat2.weight = 9;
		cat2.color = "Brown";

	}

}
