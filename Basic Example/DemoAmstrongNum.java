//Check if a number is Armstrong number.
/*
package Day1;
import java.util.Scanner;
public class DemoAmstrongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
		int rem=0;
		int temp=num;
		int length=0;
		while(num>0)
		{
		
			length+=1;
			num/=10;		
		}
		num=temp;
		int arm=0;
		while(num>0)
		{
			rem=num%10;
			int  temp1=1;
			for (int i = 0; i < length; i++)
			{
				temp1=temp1*rem;
				
			}
			arm=arm+temp1;
			num/=10;
		}

		if(arm==temp)
			System.out.print("Number "+temp+" Is Amstrong Number");
		else
			System.out.print("Number  '"+temp+ "' is not amstrong");
	}
}
/* ::Output::
Enter Any Number
12312
Number  '12312' is not amstrong
*/
//Check if a number is Armstrong number.
package Day1;
import java.util.Scanner;
public class DemoAmstrongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int range=sc.nextInt();
		int rem=0;
		int temp=0;
		int length=0;
		int num=0;
		System.out.print(" Amstrong Number Serise ::");
		for (int i = 1; i <range; i++) 
		{
		num=i;
		rem=0;
		temp=i;
		length=0;
		while(num>0)
		{
		
			length+=1;
			num/=10;		
		}
		num=temp;
		int arm=0;
		while(num>0)
		{
			rem=num%10;
			int  temp1=1;
			for (int i1 = 0; i1 < length; i1++)
			{
				temp1=temp1*rem;
				
			}
			arm=arm+temp1;
			num/=10;
		}

		if(arm==temp)
			System.out.print(temp);
		}
	}
}
/* ::Output::
Enter Any Number
12312
Number  '12312' is not amstrong
*/