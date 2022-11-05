package com.neotech.lesson19;

public class EmployeeWithinPackage {

	public static void main(String[] args) {
		Employee emp = new Employee();

		Employee.company = "Neotech";

		emp.name = "Sabah";

		emp.lastName = "Bushaj";

		emp.salary = 21342;

		emp.method1();
		emp.method2();
		emp.method3();

	}

}
