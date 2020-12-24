package day9;

public class DemoAdditionRecurssion 
{
	int add(int num)
	{
		if(num==1)
			return num;
		else
			return (add(num-1)+num);
			
	}
	public static void main(String[] args) 
	{
		DemoAdditionRecurssion d1=new DemoAdditionRecurssion();
		System.out.println("Addition="+d1.add(10));

	}

}

