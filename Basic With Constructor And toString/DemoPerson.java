/*
*	2.Create a class Person with data members as name, age, city. 
*	Write getters and setters for all the data members. 
*	Create Default and Parameterized constructors.
*	Also add the showDetails method to get details of any person.
*/
package day5;

public class DemoPerson 
{
	private String name;
	private int age;
	private String city;
						//Tight Encapsulation
	
	public DemoPerson()
	{
		this.name = null;
		this.age = 00;
		this.city = null;
	}
	public DemoPerson(String name, int age, String city)
	{
		this.name = name;
		this.age = age;
		this.city = city;
	}
						//Paramterized Constructor
	String showDetails()
	{
		return "Name is :"+name+ "\nAge is :"+age+"\nCity :"+city;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	
	

}
