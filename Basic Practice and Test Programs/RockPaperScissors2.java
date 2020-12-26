/**
 * 
 * Write a program that plays Rock,Paper,Scissors better than Random against human.
 * Try to exploit that humans are very bad at generating random numbers
 * 
 **/

package review.day2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors2 
{
	static Random random=new Random();
	
	public static void main(String[] args) 
	{
		boolean exit = true;
		Scanner sc = new Scanner(System.in);
		while (exit) 
		{
			System.out.println("*******  OPTIONS  ********"
					+ "\n1.Rock"
					+ "\n2.Paper"
					+ "\n3.Scissors"
					+ "\n4.Exit"
					+ "\n----Select Your Option----");
			switch (sc.nextInt()) 
			{
				case 1: 
						playGame(1, selectRandomly());
						break;
	
				case 2:
						playGame(2, selectRandomly());
						break;
	
				case 3:
						playGame(3, selectRandomly());
						break;
				case 4:
						System.out.println("!!! Good Bye !!!");
						exit = false;
	
						break;
	
				default:
						System.out.println("Invalid Option");
						break;
			}
		}
	}

	

	public static int selectRandomly() 
	{
		switch(random.nextInt(4))
		{
			case 0: return 1;

			case 1: return 2;
					
			case 2: return 3;
				
			default:	return 0 ;
		}
	
	}
	
	public static void playGame(int userSelected, int randomlySelected) 
	{
		if(userSelected==randomlySelected)
			System.out.println("Match Tie");
			
		else if(userSelected==1 && randomlySelected==3)
			System.out.println("User win ! Rock beats Scissors");
		
		else if(userSelected==2 && randomlySelected==1)
			System.out.println("User win ! Paper beats Rock");
			
		else if(userSelected==3 && randomlySelected==2)
			System.out.println("User win ! Scissors beats Paper");
		
		else if(userSelected==3 && randomlySelected==1)
			System.out.println("Random win ! Rock beats Scissors");
		
		else if(userSelected==1 && randomlySelected==2)
			System.out.println("Random win ! Paper beats Rock");
		
		else if(userSelected==2 && randomlySelected==3)
			System.out.println("Random win ! Scissors beats Paper");
		
		else
			System.out.println("Invalid by random");
		
	}
}
