package Assignment;

import java.util.ArrayList;

public class ListConcatination 
{

	public static void main(String[] args) 
	{
		ArrayList arrayList=new ArrayList();
		arrayList.add('a');
		arrayList.add('b');
		arrayList.add('c');
		
		System.out.println(arrayList);
		
		ArrayList<Integer> arrayList1=new ArrayList<Integer>();
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);
		System.out.println(arrayList1);
		
		arrayList.addAll(arrayList1);
		System.out.println(arrayList);
		
		

	}

}
