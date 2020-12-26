package area;

public class Triangle extends Shape
{

	public Triangle(int side, double sideLength)
	{
		super(side, sideLength);
	}


	public void calculateAreaOfShape()
	{
		double area=0;
		double sides=(super.getSideLength()*super.getSide())/2;
		area=Math.sqrt(sides*(sides-(super.getSideLength()))*(sides-super.getSideLength())*(sides-super.getSideLength()));
		System.out.printf("\nArea of Triangle is %.4f",area);
	}
}
