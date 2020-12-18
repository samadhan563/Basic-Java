/*
 * 2. Create a java application for the following.
 
Create a Student class , with data members (all private : tight encapsulation)
name(String),stream(String),age(int), degreePer(double).
Add 2 methods to StudentClass as,
 
1.1 void setData() ... take user i/p using scanner & store details in student
1.2  void display() ...show student details on console

1.1 Create a TestStudent class . Use scanner to accept user i/ps.

1.2 Create 2 students student1, student2

1.3 accept & display customer details.*/
package day3;
import java.util.Scanner;

public class DemoStudent
{
	Scanner sc=new Scanner(System.in);
	
	private String name;
	private String stream;
	private int age;
	double degreePer;
	void setData()
	{
		System.out.println("Enter Student Details ie.. Name, stream, Age, Degree_Percentage");
		name=sc.next();
		stream=sc.next();
		age=sc.nextInt();
		degreePer=sc.nextDouble();			
	}
	void display()
	{
		System.out.println("Name= "+ name +"  Stream="+ stream +" Age="+ age +" Degree_Percentage="+ degreePer);
	}

}
