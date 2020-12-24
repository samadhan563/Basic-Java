package day9;
import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import static java.lang.System.*;
public class DemoStringArray 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		out.print("Enter String Array Size");
		int size=sc.nextInt();
		String arr[]=new String[size];
		System.out.println("Enter String element");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.next();
		}
		StringBuffer arr1=new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			arr1.append(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr1);
		}
	}

}
