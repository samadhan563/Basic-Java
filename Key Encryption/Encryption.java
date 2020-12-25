package ordermanagement;


import java.util.*;


public class Encryption {
    public static void main(String args[] ) 
    {
        Scanner sc=new Scanner(System.in);
      String str=sc.next();
      int aa=sc.nextInt();
      String nstr="";
    
      for(int i=0;i<str.length();i++)
      {
          if(Character.isDigit(str.charAt(i)))
          {
        	  int a=(Character.getNumericValue(str.charAt(i))+4);
        		  System.out.print(a=(a>10)?(a-10):a);
          }
          else if(Character.isAlphabetic(str.charAt(i)))
          {
        	  int b;
        	  char a=(str.charAt(i));
				if (Character.isUpperCase(a))
				{
					a=(char)((int)(str.charAt(i)+4));
					/*
					 * if((int)a>90) System.out.print((a-90)); else System.out.print((a));
					 * //
					 */		
					System.out.print(a = (char) (((int)a > 90) ? (a - 26) : a));	
				}
				else
				{
					 a=(char)((int)(str.charAt(i)+4));
					System.out.print(a = (char) ((a > 122) ? (a - 26) : a));
				}
          }
         else
         {
             System.out.print(str.charAt(i));
         }
      }
    }

	}


/*
All-convoYs-9-be:Alert1.
4
Epp-gsrzsCw-3-fi:Epivx5.
*
*/