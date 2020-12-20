package day3;

import java.util.Scanner;

public class DemoPrimeFactor {


		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number ");
			int num=sc.nextInt();
			int count=0;
			for (int i = 2; i <= num; i++) 
			{
				
				while(num%i==0)
				{
					
					System.out.println(i+" ");
					num=num/i;
				}
				
			}
			if(count<2)
				System.out.println(num);
			

		}

	}
		
	