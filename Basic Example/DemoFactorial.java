//Write a program to find factorial of a given number.
package Day1;
import java.util.Scanner;
public class DemoFactorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		long fact=1;
		for (int i = 1; i <= num; i++) 
		{
			fact=(fact*i);
		}
		System.out.println("Factorial =  "+fact);
	}

}
/* Output::
Enter Number
5
Factorial =  120
*/