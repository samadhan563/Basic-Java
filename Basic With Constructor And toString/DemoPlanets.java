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
	--- calcula	te distance between any set of planets .
	--Print planets details also.
*/
package day5;

public class DemoPlanets 
{
	
		private String name;
		private double distanceFromSun;
		private double gravity;
		
		public  DemoPlanets(String name, double distanceFromSun, double gravity)
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
		
		
