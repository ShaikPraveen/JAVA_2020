package com.java.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Handling_ExceptionHandling 
{

	public void add()
	{
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
			System.out.println("START");
		}catch(ArithmeticException e)
		{
			System.out.println("[ERROR]  --- IS COMMING");	
		}
		
		System.out.println("END");
	}
	
	
	
	public void readData()
	{
		try
		{
			File f=new File("E:\\Praveen_Automation\\File_Handling_Sample12312.txt");
			FileReader fr=new FileReader(f);
			System.out.println("START");
		}catch(FileNotFoundException e)
		{
			System.out.println("[ERROR] --- EXCEPTION IS COMMING");
		}
	
		System.out.println("END");
	}
	
	public static void main(String[] args) 
	{
		Handling_ExceptionHandling he=new Handling_ExceptionHandling();
		he.add();
		he.readData();
	}

}
