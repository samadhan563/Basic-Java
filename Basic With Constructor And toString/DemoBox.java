/*
Assignment Statement for DAy 5

Create a Box class with attributes length,width,height,color

Create default & parameterised constructor.

Write method 
	-- showDetails to get details of any box                   
                            String showDetails(){...}
                 --  calVolume to calculate volume of a box.
                               double calVolume(){...........}

Also add getter ,setters for all data members.

Implement Concept of constructor chaining .

In main Tester create appropriate objects of Box with all varieties like simple Box, Cube etc.....
Try Setter , Getters on these Boxes.

*/


package day5;

public class DemoBox 
{
	private double length,width,height;
	private String color;
	
	public DemoBox()
	{
		this.length=0.0;
		this.width = 0.0;
		this.height = 0.0;
		this.color = null;
	}

	public DemoBox(double length, double width, double height, String color)
	{
	
		this.length = length;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	 DemoBox(double dia,String color)
	{
		this(dia,dia,dia,color);
	}
	String showDetails()
	{
		return "["+length+ ", "+height+", "+width+", "+color+"]";
		
	}
	public String getColor() {
		return color;
	}

	/*public void setColor(String color) {
		this.color = color;
	}*/

	double calVolume()
	{
		return height*width*length;
	}
	

}
