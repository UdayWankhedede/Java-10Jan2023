package demo.com;

class StudentDemo
{
	public int sid ;
	public float Marks ;
	public String name;
	
	public void entreDetails(int id , float m, String n)
	{
		sid = id;
		Marks = m;
		name = n;
	}
	
	public void Display()
	{
		System.out.println(sid + "  " + Marks + "  " + name + " ");
	}
}
public class Student 
{
	public static void main(String args[ ])
	{
		StudentDemo sobj1 = new StudentDemo();
		StudentDemo sobj2 = new StudentDemo();
		
		StudentDemo sobj3 = sobj1;
		
		sobj1.entreDetails(1, 22, "uday");

		sobj1.entreDetails(14, 50, "aditi");
		
		//System.out.println("||"+sobj1.toString()+ "||"  +  sobj2.toString()+"||"); //printing hashcode of to object

		//System.out.println("||"+sobj1.toString()+ "||"  +  sobj3.toString()+"||");
	}
}
