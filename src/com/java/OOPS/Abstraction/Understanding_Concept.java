package com.java.OOPS.Abstraction;

public abstract class Understanding_Concept //This an Abstract class
{
	//Note: A class can contain Abstract methods and Concreate Methods
	
	  //The Below method is called Concrete Method
	   public void sum(int a, int b) //Method Declaration
	   {
		   System.out.println(a+b); //Define a Method
	   }
	   
	   //The below methods are  called abstract method
	   public abstract void sub(int a, int b);
	   public abstract void mul(int a, int b);
	   
	  //We can not create object for abstract methods
}
