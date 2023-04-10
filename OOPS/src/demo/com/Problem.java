package demo.com;

import java.util.Scanner;

class Problems
{
	public void Display(int id , String n)
	{
		System.out.println(id + n);
	}
}
public class Problem {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		for(int iCnt = 0; iCnt < 2; iCnt++)
		{
			Scanner sobj = new Scanner(System.in);
			System.out.println("Entre the id");
			int sid = sobj.nextInt();
			System.out.println("Entre the name");
			String name = sobj.nextLine();
			
			Problems pobj = new Problems();
			
			pobj.Display(sid, name);
		}

	}

}
