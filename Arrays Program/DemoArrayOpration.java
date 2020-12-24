/*
 * Write a program to create an array of integers and perform following operations on that array like finding the sum, average, maximum and minimum number in that array. 
 * Accept the numbers of the array from user.
 */
package day7;

import java.util.Scanner;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class DemoArrayOpration 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.println("Enter Array Size");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter Array Element ::");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
					
		}
		System.out.println("Enter Choice");
		System.out.println("1.Sum\n2.Avg\n3.max\n 4.min");
		int ch=sc.nextInt();
		
		switch( ch)
		{
		case 1: for (int i = 0; i < arr.length; i++) 
				sum+=arr[i];
				System.out.println("Sum"+sum);
				break;
		case 2: for (int i = 0; i < arr.length; i++) 
				sum+=arr[i];
				System.out.println("Avg"+sum/arr.length);
				break;	
		case 3:	
				int max=0;
				for (int i = 0; i < arr.length; i++)
				{
					max=max>arr[i] ? max : arr[i]	;		
				}
				System.out.println(max);
				break;
		case 4:	
				int min=0;
				for (int i = 0; i < arr.length; i++)
				min=min>arr[i] ? min : arr[i];		
				System.out.println(min);
			break;
			default: System.out.println("Wrong");
		}

	}

}
/* ::Output::
 Enter Array Size
5
Enter Array Element ::
2 3 4 5 6
Enter Choice
1.Sum
2.Avg
3.max
 4.min
1
Sum20
*/
