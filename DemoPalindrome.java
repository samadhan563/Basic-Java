package Day1;

import java.util.Scanner;

public class DemoPalindrome 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. ");
		int num=sc.nextInt();
		int num1=num;
		int rev=0,rem=0;
		while(num != 0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(num1==rev)
			System.out.println("Palindrome Number");
		else
			System.out.println("Palindrome Not Number");
	}
}
/*::Output::
Enter a no. 
12321
Palindrome Number
*/
