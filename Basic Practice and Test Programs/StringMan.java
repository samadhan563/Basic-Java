package hakerrank;

import java.util.Scanner;

public class StringMan 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(answerNumber(num));
	}
	
	
	
	
	
	public static String answerNumber(int num)
	{
		if(num==0)
			return "Zero";
		else if(num%5==0)
			return "Five";
		else if((num%10)!=0 && num%2==0)
			return "Even";
		else
			return "NA";
		
	}
	
	
	
	
}
