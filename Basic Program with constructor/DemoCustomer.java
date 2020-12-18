/*1. Create a java application for the following.
 
Create a Customer class , with data members (all private : tight encapsulation)
name(String),email(String),age(int), acBalance(double).
Add 2 methods to Customer Class as,

1.1 void setData() ... take user i/p using scanner & store details in customer
1.2  void display() ...show customer details on console

1.1 Create a TestCustomer class . Use scanner to accept user i/ps.

1.2 Create 2 customers customer1, customer2.

1.3 accept & display customer details.
*/
package day3;
import java.util.Scanner;
public class DemoCustomer
{
	Scanner sc=new Scanner(System.in);
	
		private String name;
		private String email_id;
		private int age;
		double acBalance;
		void setData()
		{
			System.out.println("Enter Customer Details ie.. Name, Email_Id, Age, Account_Balance");
			name=sc.next();
			email_id=sc.next();
			age=sc.nextInt();
			acBalance=sc.nextDouble();				
		}
		void display()
		{
			System.out.println("Name= "+ name +"  Email_Id="+ email_id +" Age="+ age +" Account_Balance="+ acBalance);
		}	
}
