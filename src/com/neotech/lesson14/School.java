package com.neotech.lesson14;

public class School {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		s1.firstName = "Mertcan";
		s1.lastName = "Sensoy";
		s1.school = "Neotech Academy";
		s1.grade = 'A';
		s1.gender = 'M';

		s1.doHomework();
		s1.study();

	}

}
