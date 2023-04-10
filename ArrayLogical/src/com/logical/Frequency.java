package com.logical;

import java.util.Scanner;
import java.util.stream.IntStream;

class StringProblem implements StringXX
{
	public String str;
	
	public void StartStr()
	{
		Scanner sobj1 = new Scanner(System.in);
		int Query = 0;
		while(true) 
		{
			System.out.println("String console--->");
			System.out.println("Press 0 to close");
			System.out.println("Press 1 for list of operation");
			//Query = sobj1.nextLine();
			Query = sobj1.nextInt();
			
			if(Query == 1)
			{
				System.out.println("2. To find Frequency of Char");
				System.out.println("3. To find Frequency of Same Char");
				System.out.println("4. To Display Duplicate Char");
				System.out.println("5 To Display Unique");
				System.out.println("6. To Change Lower case to Upper case");
				System.out.println("7. To Change Upper case to Lower case");
				System.out.println("8. To Change Vowel into Upper case");
				System.out.println("9. To Find out  Length of String");
				System.out.println("10. To Count Words in String");
				System.out.println("11. To find out same word");
				System.out.println("12. To Find out Frequency of each word");
				System.out.println("13. To Find out word having maximum length");
				System.out.println("14. To Find out word having minimum length");
				System.out.println("15. To check weather string is Anagram or not");
				System.out.println("16. To to find duplicate words in string");
			}
			else if(Query == 0)
			{
				System.out.println("Thank you for using String operation");
		          break;
			}
			else if(Query == 2)
			{
				Accept();
				FrequencyChar();
			}
			else if(Query == 3)
			{
				Accept();
				FrequencySameChar();
			}
			else if(Query == 4)
			{
				Accept();
				DisplayDuplicate();
			}
			else if(Query == 5)
			{
				Accept();
				DisplayUnique();
			}
			else if(Query == 6)
			{
				Accept();
				strlwrX();;
			}
			else if(Query == 7)
			{
				Accept();
				struprX();;
			}
			else if(Query == 8)
			{
				Accept();
				struprVowel();
			}
			else if(Query == 9)
			{
				Accept();
				LengthOfStr();
			}
			else if(Query == 10)
			{
				Accept();
				ReplaceVowelUnique();
			}
			else if(Query == 11)
			{
				Accept();
				CountWords();
			}
			else if(Query == 12)
			{
				Accept();
				FrequencyOfEachWord();
			}
			else if(Query == 13)
			{
				Accept();
				MaxFrequencyWord();
			}
			else if(Query == 14)
			{
				Accept();
				MinFrequencyWord();
			}
			
			else if(Query == 15)
			{
				Accept();
				Anagram();
			}
			else if(Query == 16)
			{
				Accept();
				DuplicateWord();
			}
		}
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre the String");
		str = sobj.nextLine();
	}
	//uper to lower
	public void strlwrX()
	{
		char [] Arr = str.toCharArray();
		for(int i = 0; i <str.length(); i++)
		{
			if((Arr[i]>='A')&&(Arr[i]<='Z'))
				{
					Arr[i] = (char) (Arr[i]+ 32);
				}
		}
		
		System.out.println("String in lower case");
		for(int i =0; i <Arr.length; i++)
		{
			System.out.print(Arr[i]);
		}
	}
		//lower to upper
		public void struprX()
		{
			char [] Arr = str.toCharArray();
			for(int i = 0; i <str.length(); i++)
			{
				if((Arr[i]>='a')&&(Arr[i]<='z'))
					{
						Arr[i] = (char) (Arr[i]- 32);
					}
			}
			System.out.println("String in upper case");
			for(int i =0; i <Arr.length; i++)
			{
				System.out.print(Arr[i]);
			}
	}

		
		//to convert upper case vowel into lower case and wise versa
		public void struprVowel()
		{
			char[]Arr = str.toCharArray();
			for(int i =0; i <Arr.length; i++)
			{
				if(Arr[i]== 'A'||Arr[i]== 'E'||Arr[i]== 'I'||Arr[i]== 'O'||Arr[i]== 'U')
				{
					Arr[i] = (char) (Arr[i]+32);
				}
				else if(Arr[i]== 'a'||Arr[i]== 'e'||Arr[i]== 'i'||Arr[i]== 'o'||Arr[i]== 'u')
				{
					Arr[i] = (char) (Arr[i]-32);
				}
			}
			for(int i =0; i <Arr.length; i++)
			{
				System.out.print(Arr[i]);
			}
		}
		
		public void LengthOfStr()
		{
			int iCnt = 0;
			for(int i =0; i <str.toCharArray().length; i++)
			{
				iCnt++;
			}
			System.out.println(iCnt);
		}
	public void FrequencyChar()
	{
		int i = 0;
		int iCnt = 0;
		char [] Arr = str.toCharArray();
		System.out.println(Arr);
		for(i=0; i<Arr.length; i++)
		{
			if(Arr[i] != ' ')
			{
			iCnt++;
			}
		}
		System.out.println("Frequency of charachter are :" +iCnt);
	}
	
	public void FrequencySameChar()
	{
		char [] Arr = str.toCharArray();
		int iCnt =0;
		for(int i = 0; i <str.length(); i++)
		{
			iCnt = 1;
			if(Arr[i] != '\0') //allow only char
			{
			for(int j = i+1; j<str.length(); j++)
				{
					if(Arr[i] == Arr[j])
					{
						iCnt++;
						Arr[j] = '\0'; // set to 0 to avoid printing visited character
					}
				}
			}
			System.out.println("The frequency of " +Arr[i] + " is " +iCnt);
		}
	}
	
	public void DisplayDuplicate()
	{
		char [] Arr = str.toCharArray();
		for(int i = 0; i < str.length(); i++ )
		{
			if(Arr[i]!=0)
			{
				for(int j =i+1; j<str.length(); j++)
				{
					if(Arr[i] == Arr[j])
					{
						System.out.println(Arr[i]+ " more than two times :");
						break;
					}
				}
			}
		}
	}
	public void DisplayUnique()
	{
		char [] Arr = str.toCharArray();
		for(int i = 0; i < str.length(); i++ )
		{
			if(Arr[i]!=0)
			{
				for(int j =i+1; j<str.length(); j++)
				{
					if(Arr[i] != Arr[j])
					{
						System.out.println(Arr[i]+ " unique occuar once");
						break;
					}
				}
			}
		}
	}
	
	public void DisplayUniqueChar()
	{
		char [] Arr = str.toCharArray();
		for(int i = 0; i < str.length(); i++ )
		{
			if(Arr[i]!=0)
			{
				if((Arr[i]< 97))
				{
					System.out.println(Arr[i]+ " unique occuar once");
				}
			}
		}
	}
	
	public void CountWords()
	{
		//char[]Arr = str.toCharArray();
		int iCnt = 0;
		for(int i = 0; i <str.length()-1; i++)
		{
			if((str.charAt(i) ==' ')&& (str.charAt(i+1) != ' '))
			{
				iCnt++;
			}
		}
		System.out.println("Number of words are : " +(iCnt));
	}
	
	//Frequency Of Each Word
	public void FrequencyOfEachWord()
	{
		int iCnt = 0;
		
		for(int i = 0; i <str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				System.out.println(iCnt);
				iCnt=0;
			}
			else
			{
				iCnt++;
			}
		}
		System.out.println(iCnt);
	}
	public void MaxFrequencyWord()
	{
		int iCnt = 0;
		int iMax = 0;
		
		for(int i = 0; i <str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				
					iCnt=0;
			}
			else
			{
				iCnt++;
				iMax = iCnt;
				if(iMax<iCnt)
				{
					iMax = iCnt;
				}
			}
		}
		System.out.println(iMax);
	}
	
	public void MinFrequencyWord()
	{
		int iCnt = 0;
		int iMin = 0;
		
		for(int i = 0; i <str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				
					iCnt=0;
			}
			else
			{
				iCnt++;
				iMin = iCnt;
				if(iMin>iCnt)
				{
					iMin = iCnt;
				}
			}
		}
		System.out.println(iMin);
	}
	
	public void ReplaceVowelUnique()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre the uniques symbol");
		char ch = sobj.next().charAt(0);
		char[] Arr = str.toCharArray();
		
		for(int i = 0; i< Arr.length; i++)
		{
			if(Arr[i]== 'A'||Arr[i]== 'E'||Arr[i]== 'I'||Arr[i]== 'O'||Arr[i]== 'U')
			{
				Arr[i] = ch;
			}
			else if(Arr[i]== 'a'||Arr[i]== 'e'||Arr[i]== 'i'||Arr[i]== 'o'||Arr[i]== 'u')
			{
				Arr[i] = ch;
			}
		}
		System.out.println("After changing string with symbol");
		for(int i =0; i <Arr.length; i++)
		{
			System.out.print(Arr[i]);
		}
	}
	
	public void Anagram()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre the second String");
		String str2 = sobj.nextLine();
		
		char [] Arr1 = str.toCharArray();
		char [] Arr2 = str2.toCharArray();
		
		for(int i = 0; i < Arr1.length; i++)
		{
			if(Arr1[i] != Arr2[i])
			{
				System.out.println("String is not  Anagram");
				break;
			}
			else
				System.out.println("String is Anagram");
		}
		
	}
	public void DuplicateWord()
	{
		String [] splitstr = str.split(" ");
		int iCnt = 0;
		
		for(int i = 0; i <splitstr.length; i++)
		{
			iCnt = 1;
			for(int j = i +1; j < splitstr.length; j++)
			{
				if(splitstr[i].equals(splitstr[j]))
				{
					iCnt++;
					splitstr[j] = "0"; //0 means we visited that letter
				}
			}
			if(iCnt > 1 && splitstr[i] != "0")
			{
				System.out.println("Duplicate word is : "+splitstr[i]);
			}
		}
	}
}

