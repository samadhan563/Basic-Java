package bankmanagement;

import java.util.Scanner;

public class DemoATM 
{
	
	DemoTransaction t=new DemoTransaction();
	Scanner sc=new Scanner(System.in);
	public void m1(DemoBank b, DemoBank[] barr,DemoAccount a)
	{
		boolean flag=false;
		do
		{
			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println("Select"
					+ "\n1. \tAccount Balance"
					+ "\n2. \tWithdraw"
					+ "\n3. \tDeposit"
					+ "\n4. \tTransfer"
					+ "\n5. \tShow Account Transaction"
					+ "\n6. \tQuit");
			int choice=sc.nextInt();
			switch (choice) 
			{
				case 1 :System.out.println("----------------------------------------------------------------------------------------------------------");
						a.accountBalance(b);
						break;			
				case 2 :System.out.println("----------------------------------------------------------------------------------------------------------"); 
						t.accountWithdraw(b);
						break;
				case 3 :System.out.println("----------------------------------------------------------------------------------------------------------"); 
						t.accountDeposit(b);
						break;
				case 4 :System.out.println("----------------------------------------------------------------------------------------------------------");
						t.accountTranfer(b,barr);
						break;
				case 5 :System.out.println("----------------------------------------------------------------------------------------------------------");
						t.accountTranscationDetails(b);
						break;
				case 6 :flag=true;
						break;
				default:
					break;
			}
		}while(flag!=true);
	}
}
