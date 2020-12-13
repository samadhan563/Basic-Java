// Accept 2 no. from user for division if second no. is zero then print an error message
package Day1;

import java.util.Scanner;

public class DemoForDivisionWithZero
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		double  num1=sc.nextDouble();
		double  num2=sc.nextDouble();
	
		if(num1>0 && num2>0)
		{
			double div=num1/num2;
			System.out.println(div);
		}
		else
		{
			System.out.println("Divde By Zero Error");
		}
	sc.close();
	}
}
/* Output::
Enter Two Number
20
0
Divde By Zero Error
 */


