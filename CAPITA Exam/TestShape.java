package area;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args)
	{
		//Shape s=new Shape();
		Scanner sc =new Scanner(System.in);
		while(true)
		{	
			System.out.println("\nEnter the side :");
			int side=sc.nextInt();
			switch(side)
			{
			case 4 :new Square(4,15).calculateAreaOfShape();
					break;
			case 3 :new Triangle(3,12).calculateAreaOfShape();
					break;
			case 5 :new Shape().calculateAreaOfShape();
					System.exit(0);	
			
					
		}
		}
		
		
	}

}
