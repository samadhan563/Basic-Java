package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array as a String  ");
		String str=new String();
		str=sc.nextLine();
		
		str=str.replaceAll("]","").replaceAll(",","").replaceAll(" ","").replace("[", "");

		int[] arr=new int[str.length()];
		System.out.println("Position for rotation ::"); 
		//int k=Character.getNumericValue(sc.next().charAt(0));
		
		int k=Integer.parseInt(sc.next());
		
		for (int i = 0; i < str.length(); i++) 
		{
			arr[i]=Character.getNumericValue(str.charAt(i));
		}
		
		for (int i = 0; i < k; i++) 
		{
			int lastOfCurrArr=arr[arr.length-1];
			for (int j = arr.length-1; j >0 ; j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=lastOfCurrArr;
		}
		System.out.println(Arrays.toString(arr));
	}

}
//[1, 2, 3, 4, 5, 6, 7]
