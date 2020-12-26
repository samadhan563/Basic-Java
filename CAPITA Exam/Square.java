package area;

public class Square extends Shape {

	public Square(int side, double sideLength)
	{
		super(side, sideLength);
	}

	public void calculateAreaOfShape()
	{
		double area=0;
		area=(getSideLength()*getSideLength());
		System.out.printf("Area of the Square is %2.2f",area);
	}

}
