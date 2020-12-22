/*
	  1.Create a class  that captures planets. Each planet has a name, a distance from the sun, and its gravity relative to Earth’s gravity. For distance and gravity, use the type double which captures real numbers. Make objects for Earth and your favorite non-earth planet.
	 
	
	 
	Write getters and setters for all the data members. 
	Create Default and Parameterized constructors.
	Also add the showDetails method to get details of any planet.
	Add method for calDistance between two planets.
	Implement constructor chaining.
	
		In main Tester,
	--Create objects like earth ,mars etc....
	--Initialise objects created with user input through constructors...
	--- calculate distance between any set of planets .
	--Print planets details also.
*/
package day5;

import java.util.Scanner;

public class DemoTestPlanets 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Planet Details");
		DemoPlanets d1=new DemoPlanets(sc.next(),sc.nextDouble(),sc.nextDouble());

		System.out.println("Enter 2nd Planet Details");
		DemoPlanets d2=new DemoPlanets(sc.next(),sc.nextDouble(),sc.nextDouble());
		System.out.println("Enter 1st Planet Details::\n"+"Name is=  "+d1.getName()+"\nDistance From Sun=  "+d1.getDistanceFromSun()+"\nGravity=  "+d1.getGravity());
		double distanceFromSun1=d1.getDistanceFromSun();
		double distanceFromSun2=d2.getDistanceFromSun();
	
		System.out.println("Enter 2nd  Planet Details::\n"+"Name is=  "+d2.getName()+"\nDistance From Sun=  "+d2.getDistanceFromSun()+"\nGravity=  "+d2.getGravity());
		System.out.println("Distance Between Two Planets"+d2.calDistance(distanceFromSun1, distanceFromSun2));
		
	}

}