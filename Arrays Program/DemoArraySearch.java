package day6;

import java.util.Scanner;

public class DemoArraySearch
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Size ::");
		double arr[]=new double[sc.nextInt()];
		System.out.println("Enter Array Element::");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextDouble();
		}
		System.out.println("Array Elements::");
		for(double temp : arr)
		{
			System.out.println(temp);
		}
		
		System.out.println("Enter Key ::");
		double key=sc.nextDouble();
		System.out.println("");
		int count=0;
		for (int i = 0; i < arr.length; i++)
		{
		
			if(arr[i]==key)
			{
				System.out.println("Entered Key Found at loc::"+i);
				count=1;
				break;
				
			}
			
				
		}
		if(count==0)
			System.out.println("Entered Key not Found");
		
	}

}
/* Output
Enter array Size ::
5
Enter Array Element::
12
30
10
20
40
Array Elements::
12.0
30.0
10.0
20.0
40.0
Enter Key ::


20.0

Entered Key Found at loc::3
*/
