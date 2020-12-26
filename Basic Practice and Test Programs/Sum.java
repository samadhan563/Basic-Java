package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//CREATE THE SCANNER CLASS OBJECT TO TAKE INPUT FROM USER
		System.out.println("enter the Range:");
		int range = sc.nextInt();	//TAKE NO FROM USER AND PUT IT INTO RANGE VARIABLE
		boolean flag = false;	//SET THE FLAG==FALSE
		while (!flag)  //EXICUTE WHILE TILL FLAG=TRUE
		{
			System.out.println("-------------------------------------------");
			System.out.println("1.Prime\n2.Sum\n3.Even\n4.Odd\n5.Exit\n**Select Option::");

			switch (sc.nextInt())
			{
			//************************PRIME NUMBER****************************************
			case 1:
				System.out.println("Prime Numbers:");
				prime(range);

				break;
			//************************SUM OF NUMBER****************************************

			case 2:
				System.out.println("Sum of Numbers :" + 1 + " to " + range);
				int sum = 0;
				sum = sum(range);

				System.out.println("Sum::" + sum);
				break;
			//************************EVEN NUMBER****************************************

			case 3:
				System.out.println("Even Numbers:");
				even(range);

				break;
			//************************ODD NUMBER****************************************

			case 4:
				System.out.println("Odd Numbers:");
				odd(range);

				break;
			//************************EXIT****************************************

			case 5:
				flag = true;
				break;
			//************************DEFAULT CASE****************************************

			default:
				break;
			}
		}

	}

	//*************************************PRIME NUMBER********************************

	static void prime(int range) 		//DECLARATION AND DEFINATION OF THE FUNCTION
	{
		int sum = 0;
		ArrayList<Integer> primeArr = new ArrayList<Integer>();	//ARRAYLIST WITH GENERIC (BECAUSE WE DONT KNOW THE SIZE OF ARRAY)
		for (int i = 1; i <= range; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) 
			{
				if (i % j == 0) 
				{
					count++;
				}

			}
			if (count == 2)	// CHECK COUNT =2 BECAUSE PRIME NO IS THE NO WHICH IS ONLY MOD BY 1 AND NO ITSELF
				primeArr.add(i);
		}
		for (Integer num : primeArr)	//FOR EACH LOOP TO ETERATING THE ELEMENTS FROM ARRAYLIST
		{
			sum = sum + num;
			System.out.println(num);	//PRINT THE ELEMENTS
		}
		System.out.println("Sum of Prime numbers " + sum);	//PRINT THE SUM OF PRIME NO
	}

	//*************************************SUM OF NUMBER********************************

	static int sum(int range)  	//DECLARATION AND DEFINATION OF THE FUNCTION
	{
		int sum = 0;

		for (int i = 1; i <= range; i++) 
		{
			sum = sum + i; 		// TAKE NUMBERS  ONE BY ONE AND SUM IT
		}
		return sum;		//RETURN SUM
	}

	//*************************************EVEN NUMBER********************************

	static void even(int range) 	//DECLARATION AND DEFINATION OF THE FUNCTION
	{
		int sum = 0;
		int[] arr = new int[range / 2];	//declare the array with size =range/2
		int count = 0;
		for (int i = 1; i <= range; i++) 
		{

			if (i % 2 == 0)		//CHECK THE NO IS EVEN
			{
				arr[count++] = i;	//STORE THE EVEN ELEMENTS INTO THE ARRAY
			}
		}
		for (int i = 0; i < count; i++) {
			sum = sum + arr[i];		// iterate elements from array and sum it
			System.out.println(arr[i]);		//PRINT ARRAY ELEMENTS
		}
		System.out.println("Sum of Even numbers " + sum);		//print sum of odd numbers
	}

	//*************************************ODD NUMBER********************************
	static void odd(int range) 		//DECLARATION AND DEFINATION OF THE FUNCTION
	{
		int sum = 0;
		int[] arr = new int[range / 2];   //declare the array with size =range/2
		int count = 0;
		for (int i = 1; i <= range; i++) 
		{
			if (i % 2 != 0)			//CHECK THE NO IS ODD 
			{
				arr[count++] = i;	//STORE THE ODD ELEMENTS INTO THE ARRAY
				// System.out.println(i);
			}
		}
		for (int i = 0; i < count; i++) 
		{
			sum = sum + arr[i];	// iterate elements from array and sum it
			System.out.println(arr[i]); 	//PRINT ARRAY ELEMENTS
		}
		System.out.println("Sum of Odd numbers " + sum);	//print sum of odd numbers
	}
}

/**OutPut::
enter the Range:
20
-------------------------------------------
1.Prime
2.Sum
3.Even
4.Odd
5.Exit
**Select Option::
1
Prime Numbers:
2
3
5
7
11
13
17
19
Sum of Prime numbers 77
-------------------------------------------
1.Prime
2.Sum
3.Even
4.Odd
5.Exit
**Select Option::
2
Sum of Numbers :1to 20
Sum::210
-------------------------------------------
1.Prime
2.Sum
3.Even
4.Odd
5.Exit
**Select Option::
3
Even Numbers:
2
4
6
8
10
12
14
16
18
20
Sum of Even numbers 110
-------------------------------------------
1.Prime
2.Sum
3.Even
4.Odd
5.Exit
**Select Option::
4
Odd Numbers:
1
3
5
7
9
11
13
15
17
19
Sum of Odd numbers 100
-------------------------------------------
1.Prime
2.Sum
3.Even
4.Odd
5.Exit
**Select Option::

*/
