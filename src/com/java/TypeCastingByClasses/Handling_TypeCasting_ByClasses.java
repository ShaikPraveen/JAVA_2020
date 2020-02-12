package com.java.TypeCastingByClasses;

public class Handling_TypeCasting_ByClasses 
{
	public static void main(String[] args) {
		
	//Here the concept is 
	//My Numeric data is stored in String Format, Now i want to take it to the Numeric Format
		
		
		   //Converting String to Integer
		   String s="12345";
		
	      int i=Integer.parseInt(s);
	      System.out.println(i);
	      
	      float f= Float.parseFloat(s);
	      System.out.println(f);
	      
	      
	      //Converting int to String    
	      int j=1235; //Here i want to know howmany digits
	      String s1=String.valueOf(j);
	      System.out.println(s1.length());
	      
	}

}
