package day5;

import java.util.Scanner;

public class DemoTestBox 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		DemoBox b1=new DemoBox();
		b1.showDetails();
		System.out.println(" Box Details::\n"+b1.showDetails());
		System.out.println("Enter Box Details::\n");
		double length=sc.nextDouble();
		double width=sc.nextDouble();
		double height=sc.nextDouble();
		String color=sc.next();
		
		DemoBox b2=new DemoBox(length, width, height, color);
		System.out.println(" Box Details::\n");
		System.out.println(" Box Details::\n"+b2.showDetails());
		System.out.println("Box Volume::\n"+b2.calVolume());
		System.out.println("Box Color:Through Getter:\n"+b2.getColor());
		System.out.println("Enter Box Details::\n");
		double dia=sc.nextDouble();
		color=sc.next();
		DemoBox b3=new DemoBox(dia,color);
		System.out.println(" Box Details::\n"+b3.showDetails());
		System.out.println("Box Volume::\n"+b3.calVolume());
		
	}

}
