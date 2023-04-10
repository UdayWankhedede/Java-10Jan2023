package demo.com;

import java.util.Scanner;

class BoxProblems
{
	private int iLength;
	private int iBreadth;
	private int iHeight;
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre Length , Breadth, Height");
		this.iLength = sobj.nextInt();
		this.iBreadth = sobj.nextInt();
		this.iHeight = sobj.nextInt();
	}
	public double Volume()
	{
		double Volume;
		
		Volume = iLength * iBreadth * iHeight;
		return Volume;
		
	}
}

public class box {
	public static void main(String args[])
	{
		BoxProblems bobj = new BoxProblems();
		
		bobj.Accept();
		double iRet = bobj.Volume();
		System.out.println("volume is " + iRet);
	}

}
