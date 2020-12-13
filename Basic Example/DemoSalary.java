//3.Calculating total salary based on basic. If basic <=5000 da, ta and hra will be 10%,20% and 25% respectively  otherwise  da, ta and hra will be 15%,25% and 30% respectively.
package Day1;
import java.util.Scanner;
public class DemoSalary 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Salary\t");
		double  basic=sc.nextDouble();
		double da=0,ta=0,hra=0;
		if(basic<5000)
		{
			da=basic*10/100;
			ta=basic*20/100;;
			hra=basic*25/100;
		}
		else
		{
			da=basic*15/100;
			ta=basic*25/100;;
			hra=basic*30/100;
		}
		double salary=basic+ta+da+hra;
		System.out.println("Payble  Salary is \t"+salary);
	}
}
/* ::Output::
Enter Basic Salary	
25000
Payble  Salary is 	42500.0
*/
