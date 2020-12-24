package day6;

public class DemoInstanceAndStaticVariable 
{
	int num1=10;
	int num2=20;
	static int num3=100;
	static int num4=200;

	public static void main(String[] args) 
	{
		DemoInstanceAndStaticVariable d1=new DemoInstanceAndStaticVariable();
		d1.method();
		d1.method1();
		
	}
	void method()
	{
		System.out.println("Instance Area");
		
		System.out.println("Instance Variable::"+num1+"  "+num2);
		
		System.out.println("Static Variable::"+DemoInstanceAndStaticVariable.num3+"  "+DemoInstanceAndStaticVariable.num4);
	}
	static void method1()
	{
		DemoInstanceAndStaticVariable d1=new DemoInstanceAndStaticVariable();
		System.out.println("Instance Area");
		//num3=123;
		System.out.println("Instance Variable::"+d1.num1+"  "+d1.num2);
	
		System.out.println("Static Variable::"+DemoInstanceAndStaticVariable.num3+"  "+DemoInstanceAndStaticVariable.num4);
	}

}
