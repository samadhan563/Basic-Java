//Sum of series :			1+2+3+….+n
package Day1;

import java.util.Scanner;

public class DemoSumOfSerise
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range of no. ");
		int n=sc.nextInt();
		int sum=0;
		for (int i =1 ; i <= n; i++) 
		{
			sum=sum+i;
		}
		System.out.println("Sum of Series="+sum);
	}

}
/* ::Output::
Enter Range of no. 
10
Sum of Series=55
*/