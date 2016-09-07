import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.*;
public class Date {
	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year");
		int year = sc.nextInt(); 
		System.out.print("Enter the month");
		int month = sc.nextInt();
		month = month -1 ;
		
		
	Scanner keyboard = new Scanner(System.in);
	String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Dec"};
	int days[] ={31,28,21,30,31,30,31,31,30,31,30,31};
	
	if(month==1 && year%4==0)	days[month]= 29;
		
	GregorianCalendar gc = new GregorianCalendar(year,month,1);
	System.out.println("\t   " +months[month] + "  " +year);
	System.out.println("________________________________");
	System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
	int x = gc.get(Calendar.DAY_OF_WEEK);
	x = x-1;
	//System.out.print(x);
	//System.out.println(days[month]);
	for(int i=0;i<x;i++)
	{
		System.out.print("     ");
	}
	for(int y =1;y<=days[month];y++)
	{
	 System.out.printf("%2d   ",y);
	 if((x+y)%7==0)
		 System.out.println();
	}	
	}


}


