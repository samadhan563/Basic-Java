package Assignment;

import java.util.Random;

public class random {

	public static void main(String[] args) {

		Random r=new Random();
		int flag=0;
		
		if(flag==r.nextInt(2))
		{
			System.out.println("HEAD");
		}
		else
		{
			System.out.println("TAIL");
		}
		
	}

}
