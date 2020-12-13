//Check if the given number is even or odd.
package Day1;

import java.util.Scanner;

public class DemoEvenOdd
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number\t");
		int  Num=sc.nextInt();
		
	if(Num%2==0)
		System.out.println("Number Is Even");
	else
		System.out.println("Number Is Odd");

	}

}

/* :: Output ::
Enter Number	
50
Number Is Even
*/