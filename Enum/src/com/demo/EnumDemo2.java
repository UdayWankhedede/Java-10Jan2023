package com.demo;

enum MovieSeat {

	STANDARD(300), PREMIUM(400), RECLINER(550);

	private int price;

	MovieSeat(int price) { // internally private

		this.price = price;

	}
}

public class EnumDemo2 {
	public static void main(String[] args) {

		for (MovieSeats m : MovieSeats.values()) {
			System.out.println(m + " " + m.price);
		}

	}

}
