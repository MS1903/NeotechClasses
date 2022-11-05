package com.neotech.lesson10;

public class PrintingHours {

	public static void main(String[] args) {
		// print the whole combination of hours and mins
		// in a digital clock // 00:00

		for (int hour = 0; hour <= 24; hour++) {
			for (int minute = 0; minute < 60; minute++) {
				// System.out.println(hour + ":" + minute);
//we need to change 0:0 to 00:00 (up to 10)
				if (hour < 10 && minute < 10) {
					System.out.println("0" + hour + ":" + "0" + minute);
				} else if (hour >= 10 && minute < 10) {
					System.out.println(hour + ":" + "0" + minute);
				} else if (hour < 10 && minute >= 10) {
					System.out.println("0" + hour + ":" + minute);
				} else {
					System.out.println(hour + ":" + minute);
				}
			}
		}

	}

}
