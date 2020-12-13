//Use same code above and find the sum of product of digits of the number till result calculated is a single digit number.  
package Day1;

import java.util.Scanner;

public class DemoSumOfProductTillSingleDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num=sc.nextInt();
		System.out.println("Enter Number1 ::");
		int num1=sc.nextInt();
		int rem=0;
		int product=1;
		while(num!=0)
		{
			rem=num%10;
			product=product*rem;
			num/=10;
		}
		 rem=0;
		int  product1=1;
		while(num1!=0)
		{
			rem=num1%10;
			product1=product1*rem;
			num1/=10;
		}
		System.out.println("Product Of Digit\t"+product);
		System.out.println("Product1 Of Digit\t"+product1);
		int sum=0;rem=0;	
				while(product>0)
				{		
					rem=product%10;
					sum=sum+rem;
					product/=10;
				}
				while(product1>0)
				{
					rem=product1%10;
					sum=sum+rem;
					product1/=10;				
				}
		System.out.println("Sum Of product Digit\t"+sum);
	}
}
/*Output::
Enter Number ::
212
Enter Number1 ::
233
Product Of Digit	4
Product1 Of Digit	18
Sum Of product Digit	13
*/
