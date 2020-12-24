
package day7;

import java.util.Arrays;
import java.util.Scanner;

public class DemoReverse1DArray2 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.println("Enter Array Size");
		int arr[]=new int[sc.nextInt()];
		int arr1[]=new int[arr.length];
		System.out.println("Enter Array Element ::");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
					
		}
		//Reverse an array[1D] physical or actual elements to  reverse not just printing
		int count=4;
		for (int i = 0; i < arr.length; i++) 
		{
			arr1[i]=arr[count];
			count--;	
		}
		System.out.println("Reverse Array::"+Arrays.toString(arr1));
		
		
		//Sort an array in ascending order.[1D]
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i; j < arr.length; j++) 
			{
				int temp;
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
		
		}
		for (int val : arr)
		{
			System.out.print("  "+val);
		}
		System.out.println("\n Sorted Array::"+Arrays.toString(arr));
		
		
		//Find out the highest and second highest numbers in an array[1D]
		int first=0,second=0;
		for (int i = 0; i < arr.length; i++)
		{
			first=first>arr[i] ? first : arr[i]	;		
		}
		for (int i = 0; i < arr.length-1; i++)
		{
			second=second>arr[i] && second<first? second : arr[i]	;		
		}
		System.out.println("\n First Highest  Array Num::"+first+"\nSecond Highest  Array Num::"+second);
		
		
		
		
		
	}

	
}
