package com.dem;

public class DriverTest {

	public static void main(String[] args) {
		
		Car cobj1 = new Car("MH 32 1071", "Polo",2020);
		Car cobj2 = new Car("MH 30 1002", "Urus",2022);
		Car cobj3 = new Car("MH 14 2073", "VW",2018);
		
		Driver dobj1 = new Driver("Aditi", 123456, 5, cobj1);
		Driver dobj2 = new Driver("Uday", 44452, 10, cobj2);
		Driver dobj3 = new Driver("Adesh", 65871, 15,cobj3);
		
		System.out.println(dobj1);
		System.out.println(dobj2);
		System.out.println(dobj3);
		
		System.out.println("=======================================");
	//	cobj1.setCarName("Tigun");
		cobj1.setCarName("ddd");

		System.out.println(dobj1);
		System.out.println(dobj2);
		System.out.println(dobj3);
		System.out.println(cobj3);
		
	}

}
