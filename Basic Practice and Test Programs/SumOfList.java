/*
 * write  a  3 function that compute sum of numbers in a list using for loop, while loop
 * recursion .
 */
package review.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SumOfList 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element :: ");
		int size=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter "+size+" Elements :: " );
		for (int i = 0; i < size; i++) 
		{
			list.add(sc.nextInt());
		}
		System.out.println("Sum using for loop :: "+sumUsingFor(list));
		System.out.println("Sum while loop :: "+sumUsingWhile(list));
		System.out.println("Sum using recursion:: "+sumUsingRecursion(list,list.size()));
		sc.close();
	}

	public static int sumUsingFor(ArrayList<Integer> list) 
	{
		int sum=0;
		for(Integer num : list)
			sum=sum+num;
		return sum;
	}
	public static int sumUsingWhile(ArrayList<Integer> list) 
	{
		int sum=0;
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
			sum=sum+itr.next();
		return sum;
	}
	public static int sumUsingRecursion(ArrayList<Integer> list,int size) 
	{
		int sum=0;
		if(size<=0)
		{
			return 0;
		}	
		return (sumUsingRecursion(list,size-1)+list.get(size-1));
		
		
	}

	

}
