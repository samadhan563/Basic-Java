package ordermanagement;

import java.util.Scanner;

public class TestDemoOrdering 
{
	
	public static void main(String[] args)
	{
		boolean flag=true;
		String yoghurtDetails = null;
		String cheeseDetails=null;
		String milkDetails=null;
		String fruitDetails=null;
		String oilDetails=null;
		DemoOrdering d1=new DemoOrdering();
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("Enter Item Number");
			System.out.println("Menu Card");
			System.out.print(
					 "Item No		Item		Price"
					+"\n1		Yoghurt		50"
					+"\n2		Cheese		100"
					+"\n3		Milk		40"
					+"\n4		Fruit		200"
					+"\n5		Oil		300"
					+"\n6		Bill Genration\n");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1 : 	System.out.println("You'r  purchessing Yoghurt");
						  	yoghurtDetails=d1.yoghurt();
						  	break;
						  	
				case 2 : 	System.out.println("You'r  purchessing Cheese");
							cheeseDetails=d1.cheese();
							break;
							
				case 3 : 	System.out.println("You'r  purchessing Milk");
				  			milkDetails=d1.milk();
				  			break;
				  			
				case 4 : 	System.out.println("You'r  purchessing Fruit");
							fruitDetails=d1.fruit();
							break;
				  
				case 5 : 	System.out.println("You'r  purchessing Oil");
							oilDetails=d1.oil();
							break;
				  
				case 6 :	d1.billGenration(yoghurtDetails, cheeseDetails, milkDetails, fruitDetails, oilDetails);	
					/*
					 * System.out.println("Your Bill "); System.out.
					 * println("-----------------------------------\n***Yoghurt Details***");
					 * System.out.println(yoghurtDetails); System.out.
					 * println("-----------------------------------\n***Cheese Details***");
					 * System.out.println(cheeseDetails);
					 * System.out.println("-----------------------------------\n***Milk Details***"
					 * ); System.out.println(milkDetails);
					 * System.out.println("-----------------------------------\n***Fruit Details***"
					 * ); System.out.println(fruitDetails);
					 * System.out.println("-----------------------------------\n***Oil Details***");
					 * System.out.println(oilDetails);
					 * System.out.println("-----------------------------------");
					 * System.out.print("Actual Amount="+d1.getTotalAmount()+"\n");
					 * System.out.println("-----------------------------------");
					 * System.out.print(d1.toString()); System.out.println("\nDya ata Paise:::");
					 */
							flag=false;
				  			break;
				  			
				 default :	System.out.println("You Have Entered wrong item ::");
			}
		}while(flag==true);
	}

}
/*
 Output::
 Enter Item Number
Menu Card
Item No		Item		Price
1		Yoghurt		50
2		Cheese		100
3		Milk		40
4		Fruit		200
5		Oil		300
6		Bill Genration

1
You'r  purchessing Yoghurt
Enter Quantity of yoghurt
2
Enter Item Number
Menu Card
Item No		Item		Price
1		Yoghurt		50
2		Cheese		100
3		Milk		40
4		Fruit		200
5		Oil		300
6		Bill Genration
5
You'r  purchessing Oil
Enter Quantity of Oil
1
Enter Item Number
Menu Card
Item No		Item		Price
1		Yoghurt		50
2		Cheese		100
3		Milk		40
4		Fruit		200
5		Oil		300
6		Bill Genration
4
You'r  purchessing Fruit
Enter Quantity of Fruit
2
Enter Item Number
Menu Card
Item No		Item		Price
1		Yoghurt		50
2		Cheese		100
3		Milk		40
4		Fruit		200
5		Oil		300
6		Bill Genration
2
You'r  purchessing Cheese
Enter Quantity of Cheese
3
Enter Item Number
Menu Card
Item No		Item		Price
1		Yoghurt		50
2		Cheese		100
3		Milk		40
4		Fruit		200
5		Oil		300
6		Bill Genration
3
You'r  purchessing Milk
Enter Quantity of Milk
2
Enter Item Number
Menu Card
Item No		Item		Price
1		Yoghurt		50
2		Cheese		100
3		Milk		40
4		Fruit		200
5		Oil		300
6		Bill Genration
6
Your Bill 
-----------------------------------
***Yoghurt Details***
Yoghurt Quantity  ::	2
Yoghurt Amount  ::	100.0
-----------------------------------
***Cheese Details***
Cheese Quantity  ::	3
Cheese Amount  ::	300.0
-----------------------------------
***Milk Details***
Milk Quantity  ::	2
Milk Amount  ::		80.0
-----------------------------------
***Fruit Details***
Fruit Quantity  ::	2
Fruit Amount  ::	400.0
-----------------------------------
***Oil Details***
Oil Quantity  ::	1
Oil Amount  ::		300.0
-----------------------------------
Actual Amount=1180.0
-----------------------------------
Have membership y (For Yes)
y
Applicable for Discount of 15%
-----------------------------------
totalAmount=1357.0
  Thank You!!!
Dya ata Paise::
*/
