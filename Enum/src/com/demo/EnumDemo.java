package com.demo;

public class EnumDemo {

	public enum Season {
		SUMMER, WINTER, SPRING, AUTUMN
	}

	public static void main(String[] args) {

		for (Season s : Season.values()) {
			System.out.println(s);
		}

		System.out.println("Ordinal of winter"+Season.WINTER.ordinal());

		System.out.println("Ordinal of Spring"+Season.SPRING.ordinal());

	}

}
