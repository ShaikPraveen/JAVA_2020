package com.java.CommonKeywords;

public class TC02_Handling_Static_Keyword
{
	
	//NON STATIC METHODS AND VARIABLE
	int a;
	public void getData()
	{
		System.out.println("THIS IS NON STATIC METHOD (OR) INSTANCE METHOD");
		System.out.println("THIS IS NON STATIC VARIABLE, THE VALUE OF A IS =>"+a);
	}
	
	
	//STATIC METHOD AND STATIC VARIABLE
	
    static int b=20;
	public static void setData()
	{
		System.out.println("THIS IS STATIC METHOD");
		System.out.println("THIS IS STATIC VARIABLE, THE VALUE OF B IS =>"+b);
	}
	
	
	//2. Static Members can Share data between Multiple Objects, how follow th following example
	   static int c=0;
	   
	//3. Static member can access only other static member
	   
	   int k=10; //instance member
	   static int l=20;
	   
	   
	   public void getDetails()  //Instance Method, we can access static and non static members
	   {
		   System.out.println("THE VALUE OF K IS "+k);
		   System.out.println("THE VALUE OF L IS "+l);
	   }
	   
	   public static void setDetails() //This is Static Method, we can access only static members
	   {
		   //System.out.println("THE VALUE OF K IS "+k); //It will shows an Error
		   System.out.println("THE VALUE OF L IS "+l); 
	   }
	   
      //4. Static Block : Static block we can consider as a Constructor
	   
	   static
	   {
		   System.out.println("THIS IS STATIC BLOCK");
	   }
	   
	   public TC02_Handling_Static_Keyword()
	   {
		   System.out.println("THIS IS CONSTRUCTOR");
	   }
	
	
	public static void main(String[] args)
	{
		System.out.println("====1======");
			
		TC02_Handling_Static_Keyword st=new TC02_Handling_Static_Keyword();
	
		//Accessing Non Static Methods and Variables by using Object Reference
		st.a=100;
		st.getData();
		
		System.out.println("========********=========");
		
		//Accessing Static Methods and Variables by using Class Name and Directly
		b=20;
		setData();
		//(or)
	   TC02_Handling_Static_Keyword.b=100;
	   TC02_Handling_Static_Keyword.setData();
	   
	   System.out.println("======2======");
	   
	   
	   st.c=10;
	   TC02_Handling_Static_Keyword st1=new TC02_Handling_Static_Keyword();
	   System.out.println(st1.c);
	   
	   
	   System.out.println("=======3======");
	   st.getDetails();
	   st.setDetails();
	   
	   System.out.println("========4======");  	
	}
}
