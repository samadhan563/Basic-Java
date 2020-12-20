/*Display Stationary menu to user. Assign fixed prices to items.
User will select items from menu along with the quantity. (eg 1. Pen 2. Pencil 3. PaperRim 4. NoteBook.......10 . Generate Bill ) When user enters 'Generate Bill' option, display total bill & exit.
(Can use System.exit(0) to terminate java app or simply exit=true )*/
package day3;

import java.util.Scanner;

public class DemoStactinary 
{

		static int pen=5;
		static int pencile=6;
		static int paperrim=50;
		static int notebook=5;
		static int book=10;
		static int rubber=2;
		int amount=0;
		int qty=0;
		Scanner sc=new Scanner(System.in);
		int menu()
		{
			int flag;
			System.out.println("Enter what do you want to purches::");
		
			
			do
			{
				System.out.println("1. Pen \n2.pencile\n3.paperrim\n4.notebook\n5.book\n6.rubber(Eraser)");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1 :
						System.out.println("Enter Quantity of Pen");
						qty=sc.nextInt();
						amount=amount+qty*5;
						break;
						
					case 2 :
						System.out.println("Enter Quantity of Pencile");
						qty=sc.nextInt();
						amount=amount+qty*6;
						break;
					case 3 :
						System.out.println("Enter Quantity of Paper rim");
						qty=sc.nextInt();
						amount=amount+qty*50;
						break;
					case 4 :
						System.out.println("Enter Quantity of Note Book");
						qty=sc.nextInt();
						amount=amount+qty*5;
						break;
					case 5 :
						System.out.println("Enter Quantity of Book");
						qty=sc.nextInt();
						amount=amount+qty*10;
						break;
					case 6 :
						System.out.println("Enter Quantity of Rubber(Eraser)");
						qty=sc.nextInt();
						amount=amount+qty*2;
						break;
				
						
						default :
							 System.out.println("You enter wrong product");
				}	
				System.out.println("Do You want to Continue 1 for yes Or 0 for No");
				 flag=sc.nextInt();
			}while(flag==1);
			
			return amount;
			
		}
		void display(long amount)
		{
		System.out.println("Total Amount"+amount);
		
		}
	

}
