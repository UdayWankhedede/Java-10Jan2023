package demo.com;

import java.util.Scanner;

class CopyProblem
{
	private String name;
	private int sid;
	
	public CopyProblem (String name, int sid) //parametrized constructor
	{
		this.name = name;
		this.sid=sid ;
	}
	
	public CopyProblem(CopyProblem sobj)
	{
		this.name = sobj.name;
		this.sid = sobj.sid;
	}
	
	 public void displayData(){
	      System.out.println("Name : "+this.name);
	      System.out.println("Age : "+this.sid);
	   }
}
public class Copy {
	public static void main(String arg [])
	{
	Scanner sc =new Scanner(System.in);
    System.out.println("Entre name");
    String name = sc.next();
    System.out.println("Enter your sid ");
    int sid = sc.nextInt();
    
    CopyProblem sobj = new CopyProblem(name , sid);
    System.out.println("Contents of the original object");
    sobj.displayData();
    
    System.out.println("Contents of the copied object");
    CopyProblem cobj = new CopyProblem(sobj);
    cobj.displayData();
    
	}

}
