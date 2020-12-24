package day7;

import java.util.Scanner;

public class DemoStaticBasic
{
	static 
	{
		System.out.println("Static  Block");
	}
	int a;
	{
		System.out.println("Instnce Block");
		
	}
	public DemoStaticBasic()
	{
		System.out.println("Default Constructor");
	}
	//Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		DemoStaticBasic d=new DemoStaticBasic();
		
	//tring arr[]= {"sbba","sgahsg"	};
	
/*	StringBuffer arr;
	for (int j = 0; j < arr.length; j++) {
		System.out.println();
	}*/

	}
	
	
}

