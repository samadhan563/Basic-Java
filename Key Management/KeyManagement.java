package ordermanagement;

import java.util.Arrays;
import java.util.Scanner;

public class KeyManagement {
	private String[] keySet;
	private String[] locksSet;
	private String[] uniqeKeys;
	int blankKey = 0;
	int duplicateKey = 0;
	Scanner sc = new Scanner(System.in);

	void inputKey() {
		System.out.println("Enter have How many number of keys");
		keySet = new String[sc.nextInt()];
		System.out.println("Enter " + keySet.length + " keys");
		for (int i = 0; i < keySet.length; i++) {
			keySet[i] = sc.next();
		}
	}

	void inputLocks() {
		System.out.println("Enter have How many number of locks");
		locksSet = new String[sc.nextInt()];
		System.out.println("Enter " + locksSet.length + " locks");
		for (int i = 0; i < locksSet.length; i++) {
			locksSet[i] = sc.next();
		}
	}

	void outPut() {

		int count = 0;
		System.out.println("Total No Of Key in Bunch::" + this.keySet.length);
		System.out.println("No Of Locks ::"+this.locksSet.length);
		System.out.println("Distinct Key");
		for (int i = 0; i < keySet.length; i++) {

			int j = 0;
			for (j = 0; j < i; j++) {

				if (keySet[i].equals(keySet[j])) 
				{
					break;

				}
			}
			if (i == j) {
				System.out.println(keySet[i]);
				count++;
			}
		}
		System.out.println("Distinct No Key count::"+count);
		System.out.println("Keys Available Each Key ");
		for (int i = 0; i < keySet.length; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				if (keySet[i].equals(keySet[j])) 
				{
					duplicateKey++;
					System.out.println(keySet[i]);
					break;

				}
			
			}
		}
		System.out.println("Keys Available Each Key count "+duplicateKey);
		
		for (int i = 0; i < keySet.length; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				if (keySet[i].equals(" ")) 
				{
					blankKey++;
					System.out.println(keySet[i]);
					break;

				}
			
			}
		}
		System.out.println("Blank Keys "+blankKey);
		uniqeKeys=new String[count];
		int count1=0;
		for (int i = 0; i < keySet.length; i++) {

			int j = 0;
			for (j = 0; j < i; j++) {

				if (keySet[i].equals(keySet[j])) 
				{
					break;

				}
			}
			if (i == j)
			{
				uniqeKeys[count1]=keySet[i];
				count1++;
			}
			
		}
		for(String s : uniqeKeys)
		{
			System.out.println(s);
		}
	}
	void lockAssign()
	{
		System.out.println(this.keys());
		System.out.println(this.toString());
		System.out.println("Enter lock no for oppning from 0 to "+((this.locksSet.length)-1));
		System.out.print("Named as :: { ");
		for (int i = 0; i < locksSet.length; i++) 
		{
			System.out.print(i+" ");
		}
		System.out.println(" }");
		int lock=sc.nextInt();
		System.out.println("Enter key Number for oppning from 0 to "+((this.keySet.length)-1));
		System.out.print("Named as :: { ");
		for (int i = 0; i < keySet.length; i++) 
		{
			System.out.print(i+" ");
		}
		System.out.println(" }");
		int keyNum=sc.nextInt();
		
		
		for (int i = 0; i < locksSet.length; i++) 
		{
			locksSet[i]=uniqeKeys[i];
		}
		
		if(locksSet[lock].equals(keySet[keyNum]))
			System.out.println("Lock Is Opened");
		else
			System.out.println("Not Valid Key lock");
	}
	public String keys() 
	{
		return "Keys Set=" + Arrays.toString(keySet) + "";
	}
	public String toString() 
	{
		
				return "Locks Set=" + Arrays.toString(locksSet) + "";
	}
	
}
/*
101 102 103 104 105 106 104 101 102 103

1  2 3 4 5

*/