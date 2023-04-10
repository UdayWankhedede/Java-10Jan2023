package com.demo2;

public class UniqueOccurence {
	
	public static void printUnique(int ar[])
	{
		int count;
		int ucount=0;
		for(int i=0;i<ar.length;i++)
		{
            count=1;
			if(ar[i]=='\0')
				continue;

			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					ar[j]='\0';
					
				}
							  
			}
			if(count==1)
			{
				System.out.println("Element " +ar[i]+": "+count );
				ucount++;
			
			}
		}
		
		System.out.println("Number of unique elements are:"+ucount);
	}

	public static void main(String[] args) {

		int arr[]= {4,5,6,7,4,7,9,8,0,7};
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
			
		System.out.println();
		printUnique(arr);
		
      
	}

}
