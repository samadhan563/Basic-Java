package day9;

public class DemoVarArgs
{
	
	public static void main(String[] args)
	{
		
		System.out.println(DemoVarArgs.metod(12, 13,14,15,16));
		System.out.println(DemoVarArgs.metod(12, 13,14,15,16,17));
		
	}
	static int metod(int ...num)
	{
		int sum=0;
		for (int j = 0; j < num.length; j++) 
		{
			sum=sum+num[j];
		}
		return sum;
	}

}
