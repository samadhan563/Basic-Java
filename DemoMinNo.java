/*
package Day1;
import java.util.Scanner;
public class DemoMinNo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Number\t");
		int  Num1=sc.nextInt();
		int  Num2=sc.nextInt();
		int  Num3=sc.nextInt();
		int  min=0;
		
	if(Num1<Num2 &&Num1<Num3)
		min=Num1;
	else
	{
		if(Num2<Num1 &&Num2<Num3)
			min=Num2;
		else
			min=Num3;
	}
	System.out.println("Min No in Three Numbers\t"+min);
	}
}
/* ::Output::
Enter Three Number	
20
10
30
Min No in Three Numbers	10
*/
package Day1;
import java.util.Scanner;
public class DemoMinNo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Number\t");
		int  num1=sc.nextInt();
		int  num2=sc.nextInt();
		int  num3=sc.nextInt();
		int  min=0;
		
	min=num3<((num1<num2)? num1:num2)?num3:((num1<num2)? num1:num2);
	System.out.println("Min No in /Three Numbers\t"+min);
	}
}
/* ::Output::
Enter Three Number	
20
10
30
Min No in Three Numbers	10
*/