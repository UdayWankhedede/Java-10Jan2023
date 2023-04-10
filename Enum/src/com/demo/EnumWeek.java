package com.demo;

import com.demo.EnumDemo.Season;

public class EnumWeek {

	public enum WeekDays{MON,TUE,WED,THUS,FIR,SAT,SUN}
	
	
	public static void main(String args[]) {
		
		for (WeekDays d : WeekDays.values()) {
			System.out.println(d);
		}
		
	}
}
