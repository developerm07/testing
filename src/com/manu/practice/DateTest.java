package com.manu.practice;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		//String string_date = "15-FEB-2020";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Date:");
		String string_date=scanner.next();
		SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
		try {
		    Date d = f.parse(string_date);
		    long milliseconds = d.getTime();
		    Calendar c= Calendar.getInstance();
		    c.setTimeInMillis(milliseconds);
		    int day= c.get(Calendar.DAY_OF_WEEK);
		    System.out.println("Day is --> "+day);
		    if(day==1) {
		    	System.out.println("Day is SUNDAY");
		    }if(day==2) {
		    	System.out.println("Day is MONDAY");
		    }
		    if(day==3) {
		    	System.out.println("Day is TUESDAY");
		    }
		    if(day==4) {
		    	System.out.println("Day is WEDNESDAY");
		    }
		    if(day==5) {
		    	System.out.println("Day is THURSDAY");
		    }
		    if(day==6) {
		    	System.out.println("Day is FRIDAY");
		    }
		    if(day==7) {
		    	System.out.println("Day is SATURDAY");
		    }
		    
		}catch(Exception e) {
			
		}
	}
	
}
