package bankmanagement;
import java.util.Scanner;
public class DemoTransaction 
{
	Scanner sc=new Scanner(System.in);	
	public void accountWithdraw(DemoBank b) 
	{
		System.out.println("Enter Amount::");
		int withdrawAmount=sc.nextInt();
		if(withdrawAmount%100==0)
			{
				if(withdrawAmount<=20000 && withdrawAmount<b.getAccountBalance())
				{
					b.setAccountBalance(b.getAccountBalance()-withdrawAmount);
					System.out.println("Transaction Successful");
					System.out.println("Remaining Balance::"+b.getAccountBalance());
					b.setStatement("Amount Withdraw::\t"+withdrawAmount+" Remaining Balance:: "+b.getAccountBalance());
				}
				else
				{
					if(withdrawAmount>20000)
						System.out.println("amount limit exceed...");
					else
						System.out.println("Your Account Balance is low...");
				}
			}
			else
			{
				System.out.println("dispence amount in form of 100 200 500...");
			}
	}
	public void accountDeposit(DemoBank b) 
	{
		System.out.println("Enter Amount::");
		int depositAmount=sc.nextInt();
		if(depositAmount%100 == 0)
		{
			if(depositAmount<=20000 && depositAmount>=100)
			{
				b.setAccountBalance(b.getAccountBalance()+depositAmount);
				System.out.println("Transaction Successful");
				System.out.println("Account Balance::"+b.getAccountBalance());
				b.setStatement("Amount Deposited::\t"+depositAmount+ " New Balance:: "+b.getAccountBalance());
			}
			else if(depositAmount>20000)
			{
				System.out.println("amount limit exceed**");
			}
		}
		else
		{
			System.out.println("disposit amount in form of 100 200 500...");	
		}		
	}
	public void accountTranfer(DemoBank b, DemoBank[] barr) 
	{
		System.out.println("Enter your User ID");
		String userId = sc.next();	
		for (int i = 0; i < barr.length; i++)
		{
			if( !b.getUserId().equals(userId)&&barr[i].getUserId().equals(userId))
			{
				System.out.println("Enter Amount to Transfer ::");
				int transferAmount=sc.nextInt();
				if(transferAmount<=20000 && transferAmount<b.getAccountBalance())
				{
					b.setAccountBalance(b.getAccountBalance()-transferAmount);
					barr[i].setAccountBalance(barr[i].getAccountBalance()+transferAmount);
					System.out.println("Transaction Successful");
					System.out.println("Remaining Balance::"+b.getAccountBalance());
					b.setStatement("Amount Tranfered\t"+transferAmount+" by User:: "+b.getUserId()+" To User Id->"+barr[i].getUserId()+" Current Balance:: "+b.getAccountBalance());
					barr[i].setStatement("Amount Credited ::"+transferAmount+" by User:: "+b.getUserId()+" Current Balance:: "+barr[i].getAccountBalance());
				}
				else
				{
					if(transferAmount>20000)
						System.out.println("amount limit exceed**");
					else
						System.out.println("Your Account Balance is low");
				}
			}
		}
	}
	public void accountTranscationDetails(DemoBank b) 
	{
		System.out.println("Transaction History::"+b.getStatement());
	}
}
