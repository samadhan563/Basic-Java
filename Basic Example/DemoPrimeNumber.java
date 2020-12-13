//Check if number is a prime number or not.
/*
package Day1;
import java.util.Scanner;
public class DemoPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		int num=sc.nextInt();
		int count=0;
		for (int i = 2; i <= num/2; i++) 
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("No is prime ");
		else
			System.out.println("No is Not prime ");
	}
}
/* Output::
Enter Number 
3
No is prime 
*/
package Day1;
import java.util.Scanner;
public class DemoPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range:: ");
		int range=sc.nextInt();
		int count=0;
		System.out.println("prime number serise");
		for (int i = 2; i < range; i++) 
		{
			count=0;
			for (int i1 = 2; i1 <= i/2; i1++) 
			{
				if(i%i1==0)
				{
					count++;
					break;
				}
			}
		
		if(count==0)
		System.out.println(i);
		}
	}
}
/*Output::
Enter Range:: 
20
prime number serise
2
3
5
7
11
13
17
19
*/