/*
 Construct a simple Java class:  MyDate which has attributes - day, month and year.

1.Create accessor and mutator methods.
2.Create a constructor and overload it for zero arg & parameterised constructors.

In main method,

1. Create an object and initialize it through zero arg constr. Print the date. 

2. Create an object and initialize using  parameterized constructor . Print the date. 

3. Create an object with zero arg constr.  and initialize it using mutator methods and accesse it using accessor methods. Print the date. 
*/
package day4;

public class DemoConsMyDate 
{
	private int day;
	private int month;
	private long year;
	DemoConsMyDate()
	{
		day=00;
		month=00;
		year=0000;
	}
	DemoConsMyDate(int day,int month,long year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void display()
	{
		System.out.println("Todays Date is ::");
		System.out.println(day+"/"+month+"/"+year);
		
	}
	public int getDay()
	{
		return day;
	}
	public void setDay(int day) 
	{
		this.day = day;
	}
	public int getMonth() 
	{
		return month;
	}
	public void setMonth(int month)
	{
		this.month = month;
	}
	public long getYear() 
	{
		return year;
	}
	public void setYear(long year)
	{
		this.year = year;
	}
	
}
