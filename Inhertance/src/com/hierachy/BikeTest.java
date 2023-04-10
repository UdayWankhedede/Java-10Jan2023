package com.hierachy;

public class BikeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MountainBike mbike = new MountainBike(1102, "KTM", 120000f, 6, 10);
		RacingBike rbike = new RacingBike(7802, "BMW", 2500000f, 400);
		System.out.println(mbike);
		System.out.println(rbike);
	}
}
