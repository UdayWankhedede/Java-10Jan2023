//package com.source;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//class CourseMS {
//	static Scanner scanobj = new Scanner(System.in);
//
////	private Course c[];
////	
////	public CourseMS()
////	{
////		c = new Course[3];
////	}
////	
////	public void StartCMS()
////	{
////		
////		System.out.println("customised MS started succesfully....");
////	
////	}
//	public void InsertData(Course c1[]) {
//		for (int i = 0; i < c1.length; i++) {
//			System.out.println("Entre the id");
//			c1[i].setCid(scanobj.nextInt());
//
//			System.out.println("Entre the name");
//			c1[i].setCname(scanobj.next());
//
//			System.out.println("Entre the fees");
//			c1[i].setCfees(scanobj.nextFloat());
//		}
//	}
//
//	public void Display(Course c1[]) {
//		for (int i = 0; i < c1.length; i++) {
//			System.out.println(c1[i].toString());
//		}
//	}
////	public void Display(Course c1[],int id) {
////		for (int i = 0; i < c1.length; i++) 
////		{
////			
////			System.out.println(c1[i].toString());
////		}
////	}
//
////	public void deleteCourse(Course c1[], int cid) {
////		for (int i = 0; i < c1.length; i++) {
////			if (c1[i] != null) {
////				if (c1[i].getCid() == cid) {
////					int index = i;
////				}
////			}
////		}
////	}
//}
//
//class CourseMethod {
//	public static void main(String[] args) {
//
//		
//		CourseMS cobjMS = new CourseMS();
//		Course[] c1 = new Course[2];
//		Scanner scanobj = new Scanner(System.in);
//		int iNo = scanobj.nextInt();
//
////		cobjMS.StartCMS();
//
//		for (int i = 0; i < c1.length; i++) {
//			c1[i] = new Course();
//		}
//
//		cobjMS.InsertData(c1);
//		cobjMS.Display(c1);
////		System.out.println("Entre id to disply course");
////		cobjMS.Display(c1,iNo);
//
//	}
//}