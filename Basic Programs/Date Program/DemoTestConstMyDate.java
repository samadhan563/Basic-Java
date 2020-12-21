package day4;

import java.util.Scanner;

public class DemoTestConstMyDate
{

	public static void main(String[] args) 
	{
		int day;
		int month;
		long year;
		Scanner sc=new Scanner(System.in);
		DemoConsMyDate d1=new DemoConsMyDate();
		d1.display();
		System.out.println(" Enter Todays Date ::");
		day=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		d1=new DemoConsMyDate(day,month,year);
		d1.setDay(day);
		 day=d1.getDay();
		System.out.println(" Enter Todays Day ::"+day);
		d1.display();

	}

}
/*Output::
 Todays Date is ::
0/0/0
 Enter Todays Date ::
15 10 2020
 Enter Todays Day ::15
Todays Date is ::
15/10/2020
*/
