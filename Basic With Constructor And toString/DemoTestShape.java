package day5;

import java.util.Scanner;

public class DemoTestShape
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		DemoShape d1=new DemoShape();
		
		System.out.println(" Shape Details::\n"+d1.showDetails());
		System.out.println(" Shape Area::\n"+d1.calArea());
		System.out.println(" Shape Perimeter::\n"+d1.calPerimeter());
		System.out.println("Enter Shape Details::\n");
		double diamention1=sc.nextDouble();
		double diamention2=sc.nextDouble();
		d1=new DemoShape(diamention1,diamention2);
		System.out.println(" Shape Details::\n"+d1.showDetails());
		System.out.println(" Shape Area::\n"+d1.calArea());
		System.out.println(" Shape Perimeter::\n"+d1.calPerimeter());
		System.out.println("Enter Shape Details::\n");
	
		diamention1=sc.nextDouble();
		diamention2=sc.nextDouble();
		d1.setDiamention1(diamention1);
		System.out.println(" Shape Diamention1::\n"+d1.getDiamention1());
		d1.setDiamention1(diamention2);
		System.out.println(" Shape Diamention1::\n"+d1.getDiamention2());
		System.out.println(" Shape Area::\n"+d1.calArea());
		System.out.println(" Shape Perimeter::\n"+d1.calPerimeter());
		
		sc.close();
	}
}
	