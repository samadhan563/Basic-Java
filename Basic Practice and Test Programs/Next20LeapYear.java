/**
 * Write a program that prints next leap year
 */
package review.day2;

import java.util.Scanner;

public class Next20LeapYear 
{
	public static void main(String[] args) 
	{
		int leapYear = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current year :: ");
		int year = sc.nextInt();
		System.out.println("Next 20 leap years are ::");
		while (leapYear <= 20) 
		{
			if ((year % 4 == 0) ||( year % 400 == 0))
			{
				System.out.println(year);
				leapYear++;
			}
			year++;
		}

	}

}
