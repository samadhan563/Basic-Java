//Accept 3 subject marks from user and find percentage, and total with grade.
package Day1;
import java.util.Scanner;
public class DemoSubGrade
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Subject Marks\t");
		double  sub1=sc.nextDouble();
		double  sub2=sc.nextDouble();
		double  sub3=sc.nextDouble();
		double da=0,ta=0,hra=0;
		double avg=(sub1+sub2+sub3)/3;
		
		System.out.println(avg);
		if(avg>85)
		{
			System.out.println("Grade \t"+"A+");
						
		}
		else if(avg<85 && avg>60)
		{
			System.out.println("Grade \t"+"A");
						
		}
		else if(avg<60 && avg>50)
		{
			System.out.println("Grade \t"+"B");
						
		}
		else if(avg<50 && avg>40)
		{
			System.out.println("Grade \t"+"C");
						
		}
		else
		{
			System.out.println("Fails");
		}
	} 
}
/* ::Output::
Enter Three Subject Marks	
82
65
75
74.0
Grade 	A
*/