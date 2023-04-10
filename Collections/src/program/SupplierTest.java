package program;

import java.util.ArrayList;

public class SupplierTest {
	public static void main(String[] args) 
	{
		
		ArrayList<Item> list1 = new ArrayList<>();

		list1.add(new Item(101, "Pendrive"));
		list1.add(new Item(102, "laptop"));
		list1.add(new Item(103, "Mobile"));
		ArrayList<Item> list2 = new ArrayList<>();

		list2.add(new Item(101, "Pendrive"));
		list2.add(new Item(102, "laptop"));
		list2.add(new Item(103, "Mobile"));
		ArrayList<Item> list3 = new ArrayList<>();

		list3.add(new Item(101, "Pendrive"));
		list3.add(new Item(102, "laptop"));
		list3.add(new Item(103, "Mobile"));
		

		ArrayList<Supplier> slist = new ArrayList<>();
		
		slist.add(new Supplier(1, "TATA",list1));
		slist.add(new Supplier(1, "JIO",list2));
		slist.add(new Supplier(1, "BMW",list3));
		
		for(Supplier s : slist)
		{
			System.out.println(s.getRegNo()+ " " +s.getsName());
			System.out.println(s);
		}

	}

}
