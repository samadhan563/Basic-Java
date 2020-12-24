/*
	 * Accept no of values / size  from User(using scanner) to store double type data.
	 * Create suitable array & display it using for-loop , to confirm default values.
	 * Accept actual data from User(scanner) & store it in the array.
	 * Display array data using  for loop.
*/
package day6;

import java.util.Iterator;
import java.util.Scanner;

public class DemoDoubleArray 
{

	public static void main(String args[]) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array Size ::");
	double arr[]=new double[sc.nextInt()];
	System.out.println("Enter Array Element::");
	for (int i = 0; i < arr.length; i++)
	{
		arr[i]=sc.nextDouble();
	}
	System.out.println("Entered Array Element::");
	for(double temp : arr)
	{
		System.out.println(temp);
	}
	}
}
