package day4;

import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

public class DemoTestAccount
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		DemoAccount d1=new DemoAccount();
		long accountno;
		String name;
		String acctype;
		double balance;
		System.out.println("Enter Account Details");
		accountno=sc.nextLong();
		name=sc.next();
		acctype=sc.next();
		balance=sc.nextDouble();
		d1=new DemoAccount(accountno,name,acctype,balance); 
		
		d1.calintrest();
		System.out.println("Account No"+d1.getAccountno());
		System.out.println("Account Holder Name"+d1.getName());
		System.out.println("Account Type"+d1.getAcctype());
		System.out.println("Account Balance"+d1.getBalance());
	}

}
