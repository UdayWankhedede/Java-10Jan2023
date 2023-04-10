package com.demo;
import java.lang.*;
import java.util.*;

class ArrayX {
  private int Arr[];

  public ArrayX(int iNo) //Parameterized constructor
  {
    Arr = new int[iNo];
  }

  public void Accept() {
    int iCnt = 0;
    Scanner sobj = new Scanner(System.in);
    System.out.println("Entre the value :");

    for (iCnt = 0; iCnt < Arr.length; iCnt++) {
      Arr[iCnt] = sobj.nextInt(); // here we take input
    }
  }

  public void Display() {
    int iCnt = 0;

    System.out.println("Elements of Array are");
    
    for (iCnt = 0; iCnt < Arr.length; iCnt++) {
      System.out.println(Arr[iCnt]);// here we display input
    }
  }

  public int Summation() {
    int iCnt = 0, iSum = 0;
    for (iCnt = 0; iCnt < Arr.length; iCnt++) {
      iSum = iSum + Arr[iCnt];
    }
    return iSum;
  }
}

class Sum {
  public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);
    int iLength = 0;
    int iRet = 0;

    System.out.println("Entre the value for Constructor");
    iLength = sobj.nextInt();

    ArrayX obj = new ArrayX(iLength);

    obj.Accept();
    obj.Display();

    iRet = obj.Summation();
    System.out.println("Addition is : "+iRet);

    //obj = null;
  }
}