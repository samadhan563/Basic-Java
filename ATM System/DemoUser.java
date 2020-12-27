/*
	10. ATM Interface
	This is the longest Java tutorial on this list at just over 2 hours, but it’s an excellent project to take on. In addition to being the longest, this is probably the 
	most complex project on this list. So once this ATM Interface is complete, what will it be able to do?
	
	
	This program is made with 5 different classes: one for the account, the user, the transaction, the bank, and the ATM. Once complete, the program will prompt the user 
	to enter their unique user id to access their account. After that, the user will be prompted to enter their pin number. If entered successfully, they will be granted 
	access to their account. Once inside their account, they will be able to view the balance in the checking and savings account, as well as the following options:
	
	• Show account transactions
	• Withdraw
	• Deposit
	• Transfer
	• Quit
*/
package bankmanagement;
import java.util.Scanner;
public class DemoUser 
{
	static Scanner sc=new Scanner(System.in);
	static private int accountNumber=00000000001;
	public static void main(String[] args) 
	{
			DemoUser u=new DemoUser();
			System.out.println("Bank Data Base length::");
			DemoBank[] b=new DemoBank[sc.nextInt()];
			System.out.println("Enter Bank Details::of "+b.length +" Account Holder...\nUser Name length more than 8 char....");
			for (int i = 0; i < b.length; i++)
			{
				if(i==0)
					System.out.println("\tUser Id \tPIN\taccountBalance");	
							System.out.print("User"+(i+1)+"  ");
							b[i]=new DemoBank(sc.next(), sc.nextInt(),"Saving Account", sc.nextDouble());
							b[i].setAccountNumber(accountNumber);
							accountNumber+=1;
			}
				System.out.println("Bank Data Base::");
				System.out.println("________________________________________________________________________________");
				System.out.println("|Sr. No\t|Account Number\t|User ID\t|Pin\t|Account Type\t|Account Balance|");
			for (int i = 0; i < b.length; i++) 
			{
				b[i].displayDetails(i+1);
				//b[i].writeOnExcel(i);
			}
			System.out.println("|_______|_______________|_______________|_______|_______________|_______________|");
			u.accept(b);					
	}
	DemoAccount a=new DemoAccount();
	private String userId;
	private int pinNumber;
	public void accept( DemoBank[] barr)
	{
		boolean flag=true;
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("\nThis is ATM System");
		System.out.println("Enter your User ID");
		userId=sc.next();
		for (int i = 0; i < barr.length; i++) 
		{
			if(barr[i].getUserId().equals(this.userId))
			{
				System.out.println("Enter PIN:");
				pinNumber=sc.nextInt();	
				if(barr[i].getPinNumber()==pinNumber)
				{
					System.out.println("Login Successfully....................................");
					a.accountInfo(barr[i], this,barr);
				}
			}
			else 
				flag=false;
		}
		if(flag==false) 
			System.out.println("Thank You !!!....");//System.out.println("Invalid Credentian....");
		this.accept(barr);
	}
}
/*
Bank Data Base length::
5
Enter Bank Details::of 5 Account Holder...
User Name length more than 8 char....
	User Id 	PIN	accountBalance
User1  samadhan1	1234	25000
User2  samadhan2	2222	26000
User3  samadhan3	3333	30000
User4  samadhan4	4444	40000
User5  samadhan5	5555	80000
Bank Data Base::
________________________________________________________________________________
|Sr. No	|Account Number	|User ID		|Pin	|Account Type	|Account Balance|
|_______|_______________|_______________|_______|_______________|_______________|
|0		|1				|samadhan1		|**** 	|Saving Account |	25000.0 	|
|_______|_______________|_______________|_______|_______________|_______________|
|1		|2				|samadhan2		|**** 	|Saving Account |	26000.0 	|
|_______|_______________|_______________|_______|_______________|_______________|
|2		|3				|samadhan3		|**** 	|Saving Account |	30000.0		|
|_______|_______________|_______________|_______|_______________|_______________|
|3		|4				|samadhan4		|**** 	|Saving Account |	40000.0 	|
|_______|_______________|_______________|_______|_______________|_______________|
|4		|5				|samadhan5		|**** 	|Saving Account |	80000.0		|
|_______|_______________|_______________|_______|_______________|_______________|
----------------------------------------------------------------------------------------------------------

This is ATM System
Enter your User ID
samadhan5
Enter PIN:
5555
Login Successfully....................................
----------------------------------------------------------------------------------------------------------
Select Account Type::

1. Saving  Account
2. Current Account
1
your in Saving Account.......................................
----------------------------------------------------------------------------------------------------------
Select
1. 	Account Balance
2. 	Withdraw
3. 	Deposit
4. 	Transfer
5. 	Show Account Transaction
6. 	Quit
1
----------------------------------------------------------------------------------------------------------
Account Balance::80000.0
----------------------------------------------------------------------------------------------------------
Select
1. 	Account Balance
2. 	Withdraw
3. 	Deposit
4. 	Transfer
5. 	Show Account Transaction
6. 	Quit
2
----------------------------------------------------------------------------------------------------------
Enter Amount::
10000
Transaction Successful
Remaining Balance::70000.0
----------------------------------------------------------------------------------------------------------
Select
1. 	Account Balance
2. 	Withdraw
3. 	Deposit
4. 	Transfer
5. 	Show Account Transaction
6. 	Quit
3
----------------------------------------------------------------------------------------------------------
Enter Amount::
20000
Transaction Successful
Account Balance::90000.0
----------------------------------------------------------------------------------------------------------
Select
1. 	Account Balance
2. 	Withdraw
3. 	Deposit
4. 	Transfer
5. 	Show Account Transaction
6. 	Quit
4
----------------------------------------------------------------------------------------------------------
Enter your User ID
samadhan1
Enter Amount to Transfer ::
10000
Transaction Successful
Remaining Balance::80000.0
----------------------------------------------------------------------------------------------------------
Select
1. 	Account Balance
2. 	Withdraw
3. 	Deposit
4. 	Transfer
5. 	Show Account Transaction
6. 	Quit
3
----------------------------------------------------------------------------------------------------------
Enter Amount::
20000
Transaction Successful
Account Balance::100000.0
----------------------------------------------------------------------------------------------------------
Select
1. 	Account Balance
2. 	Withdraw
3. 	Deposit
4. 	Transfer
5. 	Show Account Transaction
6. 	Quit
5
----------------------------------------------------------------------------------------------------------
Transaction History::
Account Balance Checked::80000.0
Amount Withdraw::	10000 Remaining Balance:: 70000.0
Amount Deposited::	20000 New Balance:: 90000.0
Amount Tranfered	10000 by User:: samadhan5 To User Id->samadhan1 Current Balance:: 80000.0
Amount Deposited::	20000 New Balance:: 100000.0
----------------------------------------------------------------------------------------------------------
Select
1. 	Account Balance
2. 	Withdraw
3. 	Deposit
4. 	Transfer
5. 	Show Account Transaction
6. 	Quit
6
Thank You !!!....
----------------------------------------------------------------------------------------------------------

This is ATM System
Enter your User ID
samadhan1@
Thank You !!!....
----------------------------------------------------------------------------------------------------------

This is ATM System
Enter your User ID
samadhan1
Enter PIN:
1234
Login Successfully....................................
----------------------------------------------------------------------------------------------------------
Select Account Type::

1. Saving  Account
2. Current Account
1
your in Saving Account.......................................
----------------------------------------------------------------------------------------------------------
Select
1. 	Account Balance
2. 	Withdraw
3. 	Deposit
4. 	Transfer
5. 	Show Account Transaction
6. 	Quit
5
----------------------------------------------------------------------------------------------------------
Transaction History::
Amount Credited ::10000 by User:: samadhan5 Current Balance:: 35000.0
----------------------------------------------------------------------------------------------------------
Select
1. 	Account Balance
2. 	Withdraw
3. 	Deposit
4. 	Transfer
5. 	Show Account Transaction
6. 	Quit

*/
