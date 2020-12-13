//Finding area and perimeter of rectangle or circle.
package Day1;

import java.util.Scanner;

public class AreaAndPeraimeterOfCircle
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Length and Breath\t");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double Area=l*b;
		double Perimeter=2*(l+b);
		System.out.println("Area="+Area+"\nPerimeter"+Perimeter);

	}

}
/*:: Output ::
Enter Length and Breath	2.5
5.3
Area=13.25
Perimeter15.6
*/