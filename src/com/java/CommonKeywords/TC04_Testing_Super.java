package com.java.CommonKeywords;

public class TC04_Testing_Super extends TC04_Handling_Super_Keyword 
{
	int i=30;
	
	@Override
	public void hello()
	{  
		System.out.println("THIS IS MY CHILD CLASS HELLO");
	}
	
	
	public void testing()
	{
		int i=50;
		System.out.println("THIS IS MY TESTING METHOD");
		System.out.println(i);
		System.out.println(this.i); //Global variable
		System.out.println(super.i);
		
		this.hello();  //child  class method variable
		super.hello(); //parent class method variable
	}
	
	public  TC04_Testing_Super(int a)
	{
		super(a);
		System.out.println("THE VALUE OF A IS "+a);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		/*TC04_Testing_Super ts=new TC04_Testing_Super();
		ts.hello();
		ts.testing();*/
		
		
		TC04_Testing_Super ts=new TC04_Testing_Super(20);
		
	}
}
