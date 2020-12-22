/*
 * 1.Create a class Shape with data members dim1,dim2. 
 
 *Write getters and setters for all the data members. 
 *Create Default and Parameterized constructors.
 *Also add the showDetails method to get details of any shape.
 *Add method for calArea & calPerimeter.
 *Implement constructor chaining.

 *In main Tester,
	--Create shapes objects like square,rectangle...
	--Initialise objects created with user input through constructors...
	--Print shape details also.
*/
package day5;

public class DemoShape 
{
	private double diamention1;
	private double diamention2;
	public double getDiamention1() 
	{
		return diamention1;
	}
	public void setDiamention1(double diamention1) 
	{
		this.diamention1 = diamention1;
	}
	public double getDiamention2() 
	{
		return diamention2;
	}
	public void setDiamention2(double diamention2) 
	{
		this.diamention2 = diamention2;
	}
	public DemoShape() 
	{
		this.diamention1 = 4.5;
		this.diamention2 = 4.5;
	}
	public DemoShape(double diamention1, double diamention2) 
	{
		this.diamention1 = diamention1;
		this.diamention2 = diamention2;
	}
	String showDetails()
	{
		return "["+diamention1+ ", "+diamention2+"]";
		
	}
	double calArea()
	{
		return diamention1*diamention2;
	}
	double calPerimeter()
	{
		return 2*(diamention1+diamention2);
	}
}
