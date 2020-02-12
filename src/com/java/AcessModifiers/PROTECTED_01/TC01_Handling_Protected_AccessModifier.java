package com.java.AcessModifiers.PROTECTED_01;

public class TC01_Handling_Protected_AccessModifier
{
	/*
	 PROTECTED : Protected members can be access within package and we can access
	             Protected access modifiers in different package but package class should be child class and we have to inherit                    
    */
	
	
/*	PUBLIC                              PRIVATE          DEFAULT         PROTECTED
	    
   IN SAME CLASS                         YES               YES              YES
   IN SAME PACKAGE                       YES               YES              YES
   ANY OTHER CLASS WITHIN THE PROJECT    NO                NO               YES(But in child class only)
*/	
	
	  protected void hello()
	  {
		  System.out.println("THIS IS MY HELLO METHOD FOR PRACTISING PROTECTED ACCESS MODIFIER");
	  }	
}
