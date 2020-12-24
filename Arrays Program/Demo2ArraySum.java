

package day7;

import java.util.Arrays;
import java.util.Scanner;

import sun.security.util.Length;

public class Demo2ArraySum
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int sum=0;
		
		 //1. Calculate sum & average of numbers of Matrix.[ using 2DArray]
		/*
		System.out.println("Enter Array Size");
		int arr[][]=new int[sc.nextInt()][sc.nextInt()];
		
		System.out.println("Enter Array Element ::");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
			
		}/*
		System.out.println("Array Elements Are ::");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}

		
		System.out.println("Array Elements Are ::");
		for (int i = 0; i < arr.length; i++) 
		{
			sum=0;
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"  ");
				sum=sum+arr[i][j];
			}
			System.out.print(" Sum="+sum);
			System.out.print("   Avg="+sum/arr[i].length);
			System.out.println();
			
		}
		
*/
		/*
	// Add two Matrix using Multi-dimensional Arrays
		System.out.println("Enter 1st Array Size");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter 1 st Array Element ::");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Enter 2nd Array Size");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int arr1[][]=new int[r2][c2];
		int arrs[][]=new int[r>r2 ? r:r2][c>c2 ? c:c2];
		System.out.println("Enter 2nd Array Element ::");
		for (int i = 0; i < arr1.length; i++) 
		{
			for (int j = 0; j < arr1[i].length; j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < arrs.length; i++) 
		{
			for (int j = 0; j < arrs[i].length; j++)
			{
				arrs[i][j]= arr[i][j] + arr1[i][j];//adding two metrics
			}
		}
		System.out.println("Array Elements Are ::");
		for (int i = 0; i < arrs.length; i++)
		{
			System.out.println(Arrays.toString(arrs[i]));
		}
		for(int[] subarr :arrs)	
		{
			for(int val:subarr)
			{
				System.out.print(val +"  ");
			}
			System.out.println();
		}
		
		*/
		/*
		// Multiply two Matrix using Multi-dimensional Arrays
		System.out.println("Enter 1st Array Size");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("Enter 1 st Array Element ::");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Enter 2nd Array Size");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int arr1[][]=new int[r2][c2];
		int arrs[][]=new int[r>r2 ? r:r2][c>c2 ? c:c2];
		System.out.println("Enter 2nd Array Element ::");
		for (int i = 0; i < arr1.length; i++) 
		{
			for (int j = 0; j < arr1[i].length; j++)
			{
			
				arr1[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < arrs.length; i++) 
		{
			for (int j = 0; j < arrs[i].length; j++)
			{
				for (int j2 = 0; j2 < arrs.length; j2++) 
				{
					arrs[i][j]+= arr[i][j2] * arr1[j2][j];//adding two metrics
				}
			}
		}
		System.out.println("Array Elements Are ::");
		for (int i = 0; i < arrs.length; i++)
		{
			System.out.println(Arrays.toString(arrs[i]));
		}
		for(int[] subarr :arrs)	{
			for(int val:subarr)
			{
				System.out.print(val +"  ");
			}
			System.out.println();
		}
		
		
		//Enter data for one matrix. Find its Transpose & display result.
		/*
		System.out.println("Enter Array Size");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		int arr1[][]=new int[c][r];
		System.out.println("Enter Array Element ::");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Array Elements Are ::");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}		
		for (int i = 0; i <arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr1[j][i]=arr[i][j];
				
			}
			
		}
		System.out.println("Array Elements Are ::");
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println(Arrays.toString(arr1[i]));
		}
		*/
		//Minimum No And Maximum No.
		
			System.out.println("Enter Array Size");
				int r=sc.nextInt();
				int c=sc.nextInt();
				int arr[][]=new int[r][c];
				System.out.println("Enter Array Element ::");
				for (int i = 0; i < arr.length; i++) 
				{
					for (int j = 0; j < arr[i].length; j++)
					{
						arr[i][j]=sc.nextInt();
						
					}
					
				}
				int min=arr[0][0];
				int max=arr[0][0];
				System.out.println("Array Elements Are ::");
				for (int i = 0; i < arr.length; i++)
				{
					System.out.println(Arrays.toString(arr[i]));
				}		
				for (int i = 0; i <arr.length; i++) 
				{
					for (int j = 0; j < arr[i].length; j++)
					{
						if(max<arr[i][j])
							max=arr[i][j];
						else if(min>arr[i][j])
							min=arr[i][j];
					}
					
				}
				System.out.println("Max="+max+"\nMin="+min);
				
	/*
		
	
		
		
		System.out.println("Enter Array Size");
		int row=sc.nextInt()+1;
		int col = sc.nextInt()+1;
		int arr[][]=new int[row][col];
		System.out.println("Enter Array Element ::");
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = 0; j < arr[i].length-1; j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Array Elements Are ::\n ");
		for (int i = 0; i < arr.length-1; i++)
		{
			System.out.print("\n[");
			for (int j = 0; j < arr[i].length-1; j++) {
				
				System.out.print(arr[i][j]);
				if(j<arr[i].length-2)
					System.out.print(", ");
				}
			System.out.print("]");
		}
		sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum=0;
			for (int j = 0; j < arr[i].length; j++)
			{
			//	System.out.print(arr[i][j]+"  ");
				sum=sum+arr[i][j];
				
			}
			arr[i][col-1]=sum;
		
			
			
			
		}
		System.out.println("\nArray With Sum " + (row-1) + " Rows And "+ (col-1) +" Column");
		for (int i = 0; i < col; i++) 
		{
			sum=0;
			for (int j = 0; j <row ; j++)
			{
				//System.out.print(arr[i][j]+"  ");
				sum=sum+arr[j][i];
				
			}
			arr[row-1][i]=sum;
			
			
			//System.out.println();
			
		}
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		
		*/
	}
}
/*
1	2	3	4	10
2	3	4	5	15
3	4	5	6	18
4	5	6	7	22
10	15	18	22	65
*/