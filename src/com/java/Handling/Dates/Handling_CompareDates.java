package com.java.Handling.Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Handling_CompareDates 
{
	//How to compare dates in Java
	public static void main(String[] args)
	{
		
		//Using Date.CompareTo() method
	//If both dates are equal,  compareTo will return 0
	//If Date1 is after Date2,  compareTo will return value greater than 0
    //If Date1 is before Date2, compareTo will return value less than 0
		/*try {
			  
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = sdf.parse("2012-08-07");
            Date date2 = sdf.parse("2012-08-06");
      
            System.out.println("Date 1 " + sdf.format(date1));
            System.out.println("Date 2 " + sdf.format(date2));
  
            if (date1.compareTo(date2) > 0) {
                System.out.println("Date1 is after Date2");
            } else if (date1.compareTo(date2) < 0) {
                System.out.println("Date1 is before Date2");
            } else if (date1.compareTo(date2) == 0) {
                System.out.println("Date1 is equal to Date2");
            }
              
        } catch (ParseException ex) {
            ex.printStackTrace();
        }*/
		
		
		//Using Date.After(), Date.Before() and Date.Equals() method
		/*try {
			  
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = sdf.parse("2012-08-07");
            Date date2 = sdf.parse("2012-08-06");
      
            System.out.println("Date 1 " + sdf.format(date1));
            System.out.println("Date 2 " + sdf.format(date2));
  
            if(date1.after(date2)){
                System.out.println("Date1 is after Date2");
            } else if(date1.before(date2)){
                System.out.println("Date1 is before Date2");
            } else if(date1.equals(date2)){
                System.out.println("Date1 is equal Date2");
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }*/
		
		
		//Using Calender.After(), Calender.Before() and Calender.Equals() method
		 try {
			  
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	            Date date1 = sdf.parse("2012-08-07");
	            Date date2 = sdf.parse("2012-08-06");
	      
	            Calendar cal1 = Calendar.getInstance();
	            Calendar cal2 = Calendar.getInstance();
	            cal1.setTime(date1);
	            cal2.setTime(date2);
	              
	            System.out.println("Date 1 " + sdf.format(cal1.getTime()));
	            System.out.println("Date 2 " + sdf.format(cal2.getTime()));
	  
	            if(cal1.after(cal2)){
	                System.out.println("Date1 is after Date2");
	            } else if(cal1.before(cal2)){
	                System.out.println("Date1 is before Date2");
	            } else if(cal1.equals(cal2)){
	                System.out.println("Date1 is equal Date2");
	            }
	        } catch (ParseException ex) {
	            ex.printStackTrace();
	        }
	
	}

}
