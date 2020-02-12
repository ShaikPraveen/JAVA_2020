package com.java.StringHandling;

public class String_Handling 
{
	public static void main(String[] args)
	{
		System.out.println("==============GROUP-1 METHODS=======");
		String s="   Praveen Shaik   ";
		//1.Length
		System.out.println("Length of the String is  "+s.length());
		//2.trim
		System.out.println(s.trim().length());
		//3.Uppercase
		System.out.println(s.trim().toUpperCase());
		//4.Lowercase
		System.out.println(s.trim().toLowerCase());	
		//Remove Between spaces using replace() method
		System.out.println(s.replace(" ", " "));
		
		System.out.println("=========GROUP-2 METHODS========");
		String s1="Praveen"; String s2="Praveen Automation"; String s3="Testing"; 
		String s4="Automation-Testing-Selenium";
		
		//5. ChatAt
		System.out.println(s1.charAt(5));
		//6. Replace
		System.out.println(s1.replace('P', 'p')); //If you want to change single character, you can specify in single quote
		System.out.println(s1.replace("Praveen", "Shaik"));//If you want to change entire single, you can specify in double quote
		//7. Concatenate we have method concat()
		System.out.println(s2+" "+s3);
		System.out.println(s2.concat(" ").concat(s3));
		//8.substring
		System.out.println(s2.substring(2, 9));// Sub string means part of the string, we can find out the part of the string
		//9.contains
		System.out.println(s1.contains("Praveen")); //true
		System.out.println(s1.contains("abc")); //false
		//10.split
		String array[]=s4.split("-");
		for(String str : array)
		{
			System.out.println(str);
		}
		
		
		System.out.println("=========GROUP-3 METHODS========");
		String a="Hello";  String b="hello";
		/*if (a.equals(b)) 
		{
		   System.out.println("STRINGS ARE EQUAL");	
		} else {
			System.out.println("STRINGS ARE NOT EQUAL");
		}*/
		
		/*if (a.equalsIgnoreCase(b)) 
		{
			System.out.println("STRINGS ARE EQUAL");
		} else {
			System.out.println("STRINGS ARE NOT EQUAL");
		}*/
		
		
		/*if (a.compareTo(b)==0) //Here we are comaparing two and equal to zero,
		{
			System.out.println("STRINGS ARE EQUAL");
		} else {
			System.out.println("STRINGS ARE NOT EQUAL");
		}*/
		
		
		if (a.compareToIgnoreCase(b)==0) 
		{
			System.out.println("STRINGS ARE EQUAL");
		} else {
			System.out.println("STRINGS ARE NOT EQUAL");
		}	
	}
}
