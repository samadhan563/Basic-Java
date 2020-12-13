// Accept a number with 1 or 2 digit from user and display it in words.
package Day1;
import java.util.Scanner;
public class NumberToDigit 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		System.out.println("Digit \tWord \n");
		switch(num)
		{
			
		case 0 :System.out.print(num +"\tZero");
				break;
		case 1 :
			System.out.print( num +"\t One");
			break;
		case 2 :
			System.out.print(num +"\tTwo");
			break;
		case 3 :
			System.out.print(num + "\tThree");
			break;
		case 4 :
			System.out.print(num + "\tFour");
			break;
		case 5 :
			System.out.print(num +"\tFive");
			break;
		case 6 :
			System.out.print(num +"\tSix");
			break;
		case 7 :
			System.out.print(+ num + "\tSevan");
			break;
		case 8 :
			System.out.print(+ num +"\tEight");
			break;
		case 9 :
			System.out.println(+ num +"\tNine");
			break;
		default : System.out.println("Number is not one digit");	
		}	
	}
}
/* ::Output::
	Enter Number
	1
	Digit 	Word 

	1	 One
*/