package com.java.AccessModifiers.PRIVATE_01;

public class TC01_Handling_Private_AccessModifier
{
	/*
	 PRIVATE :- Private memebers can be accessed within the class only.
	              
	       1. Out of the package class also we can not access
	       2. In the same package of the class 
	               we can access private members with the help of constructors 
	               and we call public methods 
	       3. So, finally we can't call private members outside of the class directly     
	 */

	
	  private void hello()
	  {
		 System.out.println("THIS IS MY HELLO METHOD FOR PRACTICING PRIVATE METHOD");
	  }
	  
	  
	 public void testing()
	  {
		  this.hello();
	  }
}
