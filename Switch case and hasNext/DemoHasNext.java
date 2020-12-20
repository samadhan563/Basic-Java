/*Use Scanner to accept 2 i/ps
Check it's data type . If its integer , accept ints n compute it's average. Otherwise , print error message eg : Invalid 1st number or Invalid 2nd number
(Hint : sc.hasNextInt() , sc.nextInt())*/
package day3;
import java.util.Scanner;
public class DemoHasNext 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
	 int a=2;
	 int b,c=0;
	 System.out.println("Enter no");
	
	do
	{
			if(sc.hasNext())
			 {
			
			 c=c+sc.nextInt();
			 a--;
					// ;
			 }
	
			 else 
			 {
				 System.out.println("Error First no is not valid");
			 }
			
	}while(a!=0);
	// b=sc.nextInt();
	 float avg=(float)c/2 ;
	 System.out.println("Average ="+avg);
	}
}

/* Output::
Enter no
20
30
Average =25.0
*/
