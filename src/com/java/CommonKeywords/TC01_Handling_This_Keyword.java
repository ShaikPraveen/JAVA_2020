package com.java.CommonKeywords;

public class TC01_Handling_This_Keyword 
{
	
	//Example:-1
	int i=10; //This is Global Variable

	public  void display()
	{
		int i=20; //This is Local Variable
		
		//System.out.println(i);    //Will print the Local  Variable value
		System.out.println(this.i); //Will print the Global Variable value
	}
	
	
	
	//Example:2
	
       int a;
	   
	   public void getData(int a)
	   {
		 // a=a;//While writing this java will confuse which one local and which one global varaible
	          //To overcome this problem we will use this keyword to differentiate them
		  
		  this.a=a;
	   }
	   
	   
	   public void displayData()
	   {
		   System.out.println(a);
	   }
	   
	   
	  //Example: 3
	   
	   
	   public void hello()
	   {
		   System.out.println("HELLO MESSAGE");
	   }

	   public void displaynumber(int a)
	   {
		   this.hello();
		   System.out.println("VALUE OF A IS "+a);
	   }
	
	public static void main(String[] args) {
		TC01_Handling_This_Keyword tk=new TC01_Handling_This_Keyword();
		//tk.display();
		
		//tk.getData(100);
		//tk.displayData();
		
		tk.displaynumber(10);
           
	}

}
