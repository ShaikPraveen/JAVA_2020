package com.java.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Handling_FinallyBlock
{
	
	public void getDat()
	{
		try{
			File f=new File("E:\\Praveen_Automation\\File_Handling_Sample12312.txt");
			FileReader fr=new FileReader(f);
			
		}catch(FileNotFoundException e)
		{
			System.out.println("[ERROE] ---- IS COMING");
		}finally
		{
			System.out.println("FINALLY END");
		}
	}
	
	public static void main(String[] args) {
		Handling_FinallyBlock hf=new Handling_FinallyBlock();
		hf.getDat();
	}

}
