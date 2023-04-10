package com.demo4;

public class TheaterTest {

	public static void main(String[] args)
	{
		Movie mobj1 = new Movie(101, "Avengers","12/12/2012");
		Movie mobj2= new Movie(202, "Avatar","16/12/2016");
		Movie mobj3 = new Movie(303, "Pathan","10/05/2022");
		
		Theatre tobj = new Theatre(101,"PVR","Pune",mobj1);
		System.out.println(tobj);

		tobj.setMovie(mobj1);
		//System.out.println(tobj1);
		
	}

}
