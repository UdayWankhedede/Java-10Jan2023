package com.demo;

public class FrequencyChar {
		
	public static void countFrequency(String s)
	{
		System.out.println(s);
		s=s.toLowerCase();
		int count;
		char ch[]= s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			if((ch[i]==' ')||(ch[i]=='\0'))
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			
			System.out.println(ch[i]+" :"+count);
		}
	}

	public static void main(String[] args) {

     String s1= "Racing Car is running";
     
		countFrequency(s1);

	}

}
