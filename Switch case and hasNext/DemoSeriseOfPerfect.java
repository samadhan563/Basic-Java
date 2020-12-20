package day3;

import java.util.Scanner;

public class DemoSeriseOfPerfect
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range From and Upto::");
		int from=sc.nextInt();
		int upto=sc.nextInt();
		System.out.println("Serise of Perfect Number "+from+" To "+upto+ "=");
		for(int i=from;i<upto;i++)
		{
		int sum=0;
			for (int j = 1; j < i; j++) 
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
				
				
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
		

	}

}
/* ::Output::
Enter Range From and Upto::
20
40
Serise of Perfect Number 20 To 40=
28
*/
