package area;

public class Shape
{
	private int side;
	private double sideLength;
	
	public Shape()
	{
		
	}
	
	public Shape(int side, double sideLength)
	{
		this.side = side;
		this.sideLength = sideLength;
	}

	public void calculateAreaOfShape()
	{
		System.out.println("No Shapes Present");
	}
	
	public int getSide() 
	{
		return side;
	}

	public double getSideLength()
	{
		return sideLength;
	}

}
