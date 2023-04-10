package demo.com;

class AnonymousDemo
{
	public int iNo ;
	public float fNo;
	public String Name;
	
	public void entreDetails(int No)
	{
		iNo = No;
//		fNo = no;
//		Name = n;
	}
	
	public void Display()
	{
		System.out.println(iNo + " == " + fNo + "==  " + Name + " ");
	}
}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new AnonymousDemo();	//Here we create Anonymous object 
		//means object without refernce
		
		new  AnonymousDemo().entreDetails(20);
	}

}
