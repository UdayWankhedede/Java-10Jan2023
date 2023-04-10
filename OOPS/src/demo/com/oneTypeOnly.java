package demo.com;

class oneTypeDemo
{
	public int sid ;
	public String name;
	
	public void Entre(int id , String n)
	{
		sid = id;
		name = n;
	}
	public void Display()
	{
		System.out.println(sid + " == " + "==  " + name + " ");
	}
}
public class oneTypeOnly {

	public static void main(String[] args)
	{
		oneTypeDemo Tobj = new oneTypeDemo(),Tobj2 = new oneTypeDemo();
		 //one type only object creation

	}

}
