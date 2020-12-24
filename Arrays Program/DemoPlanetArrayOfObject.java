/*1.copy Planet class you created for Day 5 assignments. If not first create it.

	1.1 Now create array of objects type of Planets to store details of all planets.
	
	1.2 Input all data from User(use Scanner).
	
	1.3 Also calsulate distance between any two planets that user input .
	
	1.4 Display all Planets having gravity >9.0 .
	
	1.5 Display all planets details using for-each loop.
	
	
	Note : You can use switch case for writting above code.
	 	1.Create a class  that captures planets. Each planet has a name,
	  	a distance from the sun, and its gravity relative to Earth’s gravity.
	   	For distance and gravity, use the type double which captures real numbers. 
	 	Make objects for Earth and your favorite non-earth planet.
*/
	package day6;

public class DemoPlanetArrayOfObject
{
	private String name;
	private double distanceFromSun;
	private double gravity;
	
	public  DemoPlanetArrayOfObject(String name, double distanceFromSun, double gravity)
	{
	
		this.name = name;
		this.distanceFromSun = distanceFromSun;
		this.gravity = gravity;
	}

	double calDistance(double firstPlanetLength,double secondPlanetLength)
	{
		return (secondPlanetLength-firstPlanetLength);
	}
	public String getName()
	{
		return name;
	}

	public double getDistanceFromSun()
	{
		return distanceFromSun;
	}

	public double getGravity() 
	{
		return gravity;
	}

}
	
	
