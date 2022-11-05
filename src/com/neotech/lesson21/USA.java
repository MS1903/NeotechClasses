package com.neotech.lesson21;

public class USA {
	// instance variables

	String state, stateCapital;

	// constructor
	public USA(String state, String stateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;
	}

	//
	public void displayState() {
		System.out.println(state);
	}

	public void displayStateCapital() {
		System.out.println(stateCapital);

	}

	public void displayInfo() {
		this.displayState();
		this.displayStateCapital();
	}

	public static void main(String[] args) {
		USA us1 = new USA("New Jersey", "Trenton");
		System.out.println();

		System.out.println("-----------------------------------");

		USA st2 = new USA("Delaware", "Dover");

		st2.displayInfo();

	}

}
