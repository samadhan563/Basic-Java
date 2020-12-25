package ordermanagement;

import java.util.Scanner;

public class DemoOrdering 
{
	private static double totalAmount=0;
	Scanner sc=new Scanner(System.in);
	String yoghurt()
	{
		System.out.println("Enter Quantity of yoghurt");
		int yQuantity=sc.nextInt();
		double yTotal=yQuantity*50;
		totalAmount+=yTotal;
		return "Yoghurt Quantity  ::	"+yQuantity+"\n"+"Yoghurt Amount  ::	"+yTotal; 
	}
	
	String cheese()
	{
		System.out.println("Enter Quantity of Cheese");
		int cQuantity=sc.nextInt();
		double cTotal=cQuantity*100;
		totalAmount+=cTotal;
		return "Cheese Quantity  ::	"+cQuantity+"\n"+"Cheese Amount  ::	"+cTotal; 
	}
	
	String milk()
	{
		System.out.println("Enter Quantity of Milk");
		int mQuantity=sc.nextInt();
		double mTotal=mQuantity*40;
		totalAmount+=mTotal;
		return "Milk Quantity  ::	"+mQuantity+"\n"+"Milk Amount  ::		"+mTotal; 
	}
	
	String fruit()
	{
		System.out.println("Enter Quantity of Fruit");
		int fQuantity=sc.nextInt();
		double fTotal=fQuantity*200;
		totalAmount+=fTotal;
		return "Fruit Quantity  ::	"+fQuantity+"\n"+"Fruit Amount  ::	"+fTotal; 
	}
	
	String oil()
	{
		System.out.println("Enter Quantity of Oil");
		int oQuantity=sc.nextInt();
		double oTotal=oQuantity*300;
		totalAmount+=oTotal;
		return "Oil Quantity  ::	"+oQuantity+"\n"+"Oil Amount  ::		"+oTotal; 
	}
	
	void discount()
	{
		System.out.println("Have membership y (For Yes)");
		char member=sc.next().charAt(0);
		if(member=='y' || member=='Y' )
		{
			if(totalAmount>1000) 
			{
				System.out.println("Applicable for Discount of 15%");
				totalAmount += totalAmount*15/100;
			}
			else
			{
				System.out.println("Applicable for Discount of 5% ");
				totalAmount += totalAmount*5/100;
			}	
		}	
		else
		{
			if(totalAmount>1000) 
			{
				System.out.println("Applicable for Discount of 10%");
				totalAmount += totalAmount*10/100;
			}
			else
			{
				System.out.println("Sorry You are not eligible for Discount !!!");
			}
		}
		System.out.print("-----------------------------------");
	}
	
	void billGenration(String yoghurtDetails, String cheeseDetails, String milkDetails, String fruitDetails, String oilDetails)
	{
		 System.out.println("Your Bill ");
		 	if(yoghurtDetails !=null)
		 	{
		 		System.out.println("-----------------------------------\n***Yoghurt Details***");
		 		System.out.println(yoghurtDetails);
		 	}
		 	if(cheeseDetails != null)
		 	{
				System.out.println("-----------------------------------\n***Cheese Details***");
				System.out.println(cheeseDetails);
		 	}
		 	if(milkDetails != null)
		 	{
		 		System.out.println("-----------------------------------\n***Milk Details***");
		 		System.out.println(milkDetails);
		 	}
			if(fruitDetails != null)
			{
				System.out.println("-----------------------------------\n***Fruit Details***");
				System.out.println(fruitDetails);
			}
			if(oilDetails != null)
			{
				System.out.println("-----------------------------------\n***Oil Details***");
				System.out.println(oilDetails);
			}
			System.out.println("-----------------------------------");
			System.out.print("Actual Amount="+this.getTotalAmount()+"\n");
			System.out.println("-----------------------------------");
			System.out.print(this.toString());
			System.out.println("\nDya ata Paise::");
	}
	
	public double getTotalAmount() 
	{
		return totalAmount;
	}
	
	public String toString() 
	{
		this.discount();
		return "\ntotalAmount=" + totalAmount + "\n  Thank You!!!";
	}
	
	
}
