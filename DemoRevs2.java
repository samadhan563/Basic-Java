//Find reverse number of any digit input number from user.
package Day1;

import java.util.Scanner;

public class DemoRevs2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. ");
		int num=sc.nextInt();
		
		int rev=0,rem=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		
		}
		
			System.out.println("Reverse Number"+rev);
	}


}

/*
20 20/10=0
2
0
*///20/10
//2
