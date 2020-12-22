package day5;

import java.util.Scanner;

public class DemoTestPerson 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		DemoPerson d1=new DemoPerson();
		System.out.println("Enter Person Details ::");
		String name=sc.next();
		int age=sc.nextInt();
		String city=sc.nextLine();
		d1=new DemoPerson(name,age,city);
		System.out.println("Person Details::\n"+d1.showDetails());
		d1.setName(name);
		d1.setAge(age);
		d1.setCity(city);
		System.out.println("Person Details: Getter Setter:\n");
		System.out.println("Age:"+d1.getName());
		System.out.println("Age:"+d1.getAge());
		System.out.println("Age:"+d1.getCity());
		sc.close();

	}

}
