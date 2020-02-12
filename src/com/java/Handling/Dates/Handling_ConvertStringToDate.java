package com.java.Handling.Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Handling_ConvertStringToDate 
{
	//Convert String to Date in Java
	public static void main(String[] args) {
		 String date = "11/22/2012";
	        SimpleDateFormat sf= new SimpleDateFormat("MM/dd/yyyy");
	        Date d;
	        try {
	            d = sf.parse(date);
	            System.out.println(d);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	}

}
