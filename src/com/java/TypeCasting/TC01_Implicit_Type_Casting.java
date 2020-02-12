package com.java.TypeCasting;

public class TC01_Implicit_Type_Casting
{
	public static void main(String[] args) {
		
		byte b=50;   //1 byte
		short s; //2 bytes
		int i=100;   //4 bytes
		long l; //8 bytes
		
		//Now i want to Transfer byte data type value to integer data type value
		//Here byte value is smaller and integer value is bigger
		
		//i=b;  ('i' is Big and 'b' is Small)
		//System.out.println(i); //50, Whenever we transfer smaller data type to bigger data type 
		//This is Called as Implicit Type Casting, Java is  aitomatically converting that value
		
		
	    //Now i want to Convert Bigger data type value to Smaller data type value
		
	     //b=i; //Throws an Exception
		  b=(byte)i;
		  System.out.println(b);//100, Whenever we transfer bigger data type to smaller data type 
		  //This is Called as Implicit Type Casting
		  
		  //Here as now we are converting numeric  to numeric 
		  
	}

}
