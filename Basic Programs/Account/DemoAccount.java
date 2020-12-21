/*Construct a simple Java class: 
 Account which has attributes - acno,acholdername,actype,balance;
1.Create accessor and mutator methods.
2.Create a constructor and overload it for zero arg & parameterised constructors.
3.Write a method calInterest in this class. 
signature for method ,
     double calInterest(){...}
Note : if actype is saving interestrateis 7% else it is 6%.
	

In main method,

1. Create an object and initialize it through zero arg constr. Calculate interest .Print the Account Details with updated Balance.

2. Create an object and initialize using  parameterized constructor .Calculate interest. Print the Account Details with Updated Balance.

*/
package day4;



public class DemoAccount 
{

	private long accountno;
	private String name;
	private String acctype;
	private double balance;
	
	public DemoAccount() 
	{
		accountno=0;
		name="";
		acctype="";
		balance=0000;
		
	}

	public DemoAccount(long accountno, String name,String acctype , double balance) 
	{
	
		this.accountno = accountno;
		this.name = name;
		this.acctype=acctype;
		this.balance = balance;
		
	}
	public void calintrest() 
	{
		if(acctype.equals("saving")) //||acctype=="saving" ||acctype=="SAVING")
			balance=balance+(balance*7/100);
		else
			balance=balance+(balance*6/100);
		
	}
	public void display() 
	{
		System.out.println("Account holder details::");
		System.out.println(accountno);
		System.out.println(name);
		System.out.println(acctype);
		System.out.println(balance);
	}

	public long getAccountno() 
	{
		return accountno;
	}

	public void setAccountno(long accountno)
	{
		this.accountno = accountno;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getAcctype()
	{
		return acctype;
	}

	public void setAcctype(String acctype) 
	{
		this.acctype = acctype;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

}
