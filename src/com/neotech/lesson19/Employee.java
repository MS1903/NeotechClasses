package com.neotech.lesson19;

public class Employee {

	public static String company;

	public String name;

	protected String lastName;

	double salary;
	private int ssn;

	// if no access modifier, then it default
	// 2, the formula of assigning access modifier:
	// access modifier data_type variable name

	public void method1() {
		System.out.println("I am a public method!!!");
	}

	protected void method2()

	{
		System.out.println("I am a protected method!!!");
	}

	void method3() {
		System.out.println("I am a default method!!!");

	}

	private void method4() {
		System.out.println("I am a private method");

	}

	public static void main(String[] args) {

		Employee emp = new Employee();

		company = "Neotech";
		emp.name = "Sabah";
		emp.lastName = "Bushaj";
		emp.salary = 1223455;
		emp.ssn = 12345;

		emp.method1();// we can access a public method
		emp.method2(); // we can access a protected method
		emp.method3(); // we can access a default method
		emp.method4(); // we can access the private method

	}

}
