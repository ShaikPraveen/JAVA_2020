package com.java.FileHandling;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TC04_Handling_BufferedWriter 
{
	
	public static void writeDataToFile(String filepath, String fname, String data) throws IOException
	{
		File f=new File(filepath+"\\"+fname);
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write(data);
		bw.flush();
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {
		writeDataToFile("E:\\Praveen_Automation", "File_Handling_Sample123.txt","TC005.Praveen Automation Testing");	
	}
}
