package com.java.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Handling_Multiple_CatchBlocks 
{
	public void getdata()
	{
		try
		{
			File f=new File("E:\\Praveen_Automation\\File_Handling_Sample123.txt");
			FileReader fr=new FileReader(f);
			
			int i=10;
			int j=0;
			int k=i/j;
			System.out.println(k);
			System.out.println("START");
		
		}
		/*catch(FileNotFoundException e)
		{
			System.out.println("[ERROR] ---- FILE NOT FOUND EXCEPTION IS COMMING");
		}
		catch(Exception e)
		{
			System.out.println("[ERROR] ----EXCEPTION IS COMMING");
		}
		*/
		
		//Note:- We should keep Parent Class Exception at End of the Any type of exception
		
		catch(FileNotFoundException  e)
		{
			System.out.println("[ERROR] --- FILENOT FOUND EXCEPRON IS COMMING");
		}catch(ArithmeticException e)
		{
			System.out.println("[ERROR] --- ARITHEMETIC EXCEPRON IS COMMING");
		}
		
		System.out.println("END");
	}
	public static void main(String[] args)
	{
		Handling_Multiple_CatchBlocks hmc=new Handling_Multiple_CatchBlocks();
		hmc.getdata();
	}
}
