package com.logical;

import java.util.Arrays;

public class FrequencyofWords {

//	public static void frequencyWord(String str)
//	
//	{
//		str = str.toLowerCase();
//		String words [] = str.split("\\.");
//		System.out.println(Arrays.toString(words));
//		int count;
//		
//		for(int i =0; i < words.length; i++)
//		{
//			if(words[i].equals("visited"))
//			{
//				continue;
//				count=1;
//			}
//		}
//	}
//
//}

	public static void frequencyWords(String str) {
		str = str.toLowerCase();
		String lines[] = str.split("\\.");
		System.out.println(Arrays.toString(lines));
		String words[];
		String splitstr[] = null;
		int temp = 0;
		
		for (int i = 0; i < lines.length; i++) {
			words = lines[i].split(" ");
			System.out.println(Arrays.toString(words));
			for(int j = 0; j<words.length; j++)
			{
				splitstr[temp++] = words[j];
			}
		}
	}

	public static void main(String[] args) {

		String s1 = "Java is program. we code logics in java. code is important";
	}
}
