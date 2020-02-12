package com.java.InterviewPrograms;

public class TC03_Swap_Two_Strings
{
	//WAP TO SWAP TWO STRINGS
	public static void main(String[] args)
	{
		/*String s="Praveen";
		String s1="Shaik";

		System.out.println("BEFORE SWAPPING THE VALUE OF s IS   " + s);
		System.out.println("BEFORE SWAPPING THE VALUE OF s1 IS   " + s1);
		
		//1.APPEND TWO STRINGS
		s=s+s1;
		//2. STORE INITIAL STRING s IN STRING s1
		s1=s.substring(0,s.length()-s1.length());
		//3. STORE INITIAL STRING s1 IN STRING s
		s=s.substring(s1.length());
		
		
		System.out.println("AFTER SWAPPING THE VALUE OF s IS   " + s);
		System.out.println("AFTER SWAPPING THE VALUE OF s1 IS   " + s1);
*/		
		
		String a="abc";
		String b="lmn";
		System.out.println("BEFORE SWAPPING THE VALUE OF s IS   "+ a);
		System.out.println("BEFORE SWAPPING THE VALUE OF s1 IS  "+ b);
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("AFTER SWAPPING THE VALUE OF s IS   "+ a);
		System.out.println("AFTER SWAPPING THE VALUE OF s1 IS  "+ b);
		
		
		
		
	}

}
