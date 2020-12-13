//Write a program to find m to the power n
package Day1;
import java.util.Scanner;
public class DemoPower 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base Number ");
		int base=sc.nextInt();
		System.out.println("Enter Exponent Number ");
		int exp=sc.nextInt();
		int res=1;
		for (int i = 1; i <= exp; i++) 
		{
			res=res*base;
		}
		System.out.println("Power =  "+res);
	}
}
/* ::Output::
Enter Base Number 
9
Enter Exponent Number 
2
Power =  81
*/
