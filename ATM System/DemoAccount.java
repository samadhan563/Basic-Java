package bankmanagement;

import java.util.Scanner;

public class DemoAccount
{
	private int accountNumber;
	private String accountHolderName;
	private String accountType;
	private long accountHolderMobNumber;
	Scanner sc=new Scanner(System.in);
	DemoATM atm= new DemoATM();
	public void accountInfo(DemoBank b, DemoUser u, DemoBank[] barr) 
	{
		System.out.println("----------------------------------------------------------------------------------------------------------");
		boolean flag=false;
		do
		{
			System.out.println("Select Account Type::");
			System.out.println(""
								+ "\n1. Saving  Account"
								+ "\n2. Current Account"
								+ "");
				int choice=sc.nextInt();
				switch (choice) 
				{
					case 1:	if(b.getAccountType().equals("Saving Account" ))
							{
								System.out.println("your in Saving Account.......................................");
								atm.m1(b,barr,this);
								flag=true;
							}
							else 
							{
								System.out.println("Check Your Account Type");
								flag=true;
							}
							break;						
					case 2: if(b.getAccountType().equals("Current  Account" ))
								{
									System.out.println("your in Current Account.......................................");
									atm.m1(b, barr,this);
									flag=true;
								}
								else 
								{
									System.out.println("Check Your Account Type");
									flag=true;
								}
								break;
					default: System.out.println("Select correct");		
				}
		}while(flag!=true);
	}
	void accountBalance(DemoBank b)
	{
		System.out.println("Account Balance::"+b.getAccountBalance());
		b.setStatement("Account Balance Checked::"+b.getAccountBalance());
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() 
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) 
	{
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType()
	{
		return accountType;
	}
	public void setAccountType(String accountType)
	{
		this.accountType = accountType;
	}
	public long getAccountHolderMobNumber()
	{
		return accountHolderMobNumber;
	}
	public void setAccountHolderMobNumber(long accountHolderMobNumber) 
	{
		this.accountHolderMobNumber = accountHolderMobNumber;
	}	
}

	

