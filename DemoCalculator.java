package Day1;

import java.util.Scanner;

public class DemoCalculator 
{

	public static void main(String[] args) 
	{
		int res=0,num1,num2,ch;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two No\n");
		num1=sc.nextInt();
		num2=sc.nextInt();
		while(flag != true)
		{
			System.out.println("1.Add \n2.Sub\n3.Exit\n");
			System.out.println("Enter Choice\n");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: res=num1+num2;
				break;
			case 2: res=Math.abs(num1-num2
					);
				break;
			case 3: 
				flag=true;
				//System.exit(0);
			}
		
			System.out.println("Result="+res);
		}

	}
}
