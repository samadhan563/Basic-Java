
//Write a program, which reads a number and find the sum of  digits of the number.
package Day1;
import java.util.Scanner;
public class SumOfDigit 
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a no. ");
			int num=sc.nextInt();
			
			int sum=0,rem=0;
			while(num!=0)
			{
				rem=num%10;
				sum=sum+rem;
				num/=10;	
			}
				System.out.println("Sum Of Digit "+sum);
		}

}
/*
Output::
Enter a no. 
123
Sum Of Digit 6
*/



