//Write a program, which reads two numbers and find the sum of product of digits of the number.
package Day1;

import java.util.Scanner;

public class DemoSumOfProductDigit 
{


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. ");
		int num=sc.nextInt();
		
		int Product=1,rem=0;
		while(num!=0)
		{
			rem=num%10;
			Product=Product*rem;
			num/=10;
			
		}
		
			System.out.println("Product Of Digit"+Product);
			int sum=0;rem=0;
			while(Product!=0)
			{
				rem=Product%10;
				sum=sum+rem;
				Product/=10;
				
			}
			System.out.println("Sum Of Digit"+sum);
	}
}
/* ::Output::
Enter a no. 

1223
Product Of Digit12
Sum Of Digit3
*/