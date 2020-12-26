package Assignment;

import java.util.Scanner;

public class MagicalWord 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		
		int[] arr1=new int[str.length()];
		int[] arr2=new int[str.length()];
		for (int i = 0; i < str.length(); i++) 
		{
			char a=(str.charAt(i));
			
			arr1[i] =((int)a-64);
		}
		for (int i = 0; i < str1.length(); i++) 
		{
			char a=(str.charAt(i));
			
			arr1[i] =((int)a-64);
		}
		long mul1=1;
		
		for (int i = 0; i < arr1.length; i++) 
		{			
			mul1=arr1[i];
		}
		long mul2=1;
		
		for (int i = 0; i < arr2.length; i++) 
		{			
			mul2=arr1[i];
		}
		if(mul1==mul2)
			System.out.println("CHOSEN");
		else
			System.out.println("NOT CHOSEN");
		
		
	}

}
/*
COMETQ
HVNGAT
CHOSEN
*/