package day6;

import java.util.Scanner;

public class DemoTestPlanetArrayOfObject 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How May Planet");
		DemoPlanetArrayOfObject[] d=new DemoPlanetArrayOfObject[sc.nextInt()];
		for (int i = 0; i < d.length; i++) 
		{
			System.out.println("Enter Planet "+(i+1)+ " Details:: i.e...Name,... Distance From Sun,... Gravity");
			d[i]=new DemoPlanetArrayOfObject(sc.next(),sc.nextDouble(),sc.nextDouble());
			
		}
		for (int i = 0; i < d.length; i++) 
		{
			System.out.println("Enter "+(i+1)+" Planet Details::\n"+"Name is=  "+d[i].getName()+"\nDistance From Sun=  "+d[i].getDistanceFromSun()+"\nGravity=  "+d[i].getGravity());
		}
		System.out.println("Planet Gravity Greter Than 0.9 ");
		for (int i = 0; i < d.length; i++) 
		{
			if(d[i].getGravity() >0.9)
				System.out.println("Enter 1st Planet Details::\n"+"Name is=  "+d[i].getName()+"\nDistance From Sun=  "+d[i].getDistanceFromSun()+"\nGravity=  "+d[i].getGravity());
		}	
	}
}
/*
 Enter How May Planet
2
Enter Planet 1 Details:: i.e...Name,... Distance From Sun,... Gravity
Mars 24000 1.2
Enter Planet 2 Details:: i.e...Name,... Distance From Sun,... Gravity
Jupiter 25000 0.2
Enter 1 Planet Details::
Name is=  Mars
Distance From Sun=  24000.0
Gravity=  1.2
Enter 2 Planet Details::
Name is=  Jupiter
Distance From Sun=  25000.0
Gravity=  0.2
Planet Gravity Greter Than 0.9 
Enter 1st Planet Details::
Name is=  Mars
Distance From Sun=  24000.0
Gravity=  1.2
*/
