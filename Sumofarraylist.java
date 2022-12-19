package baseclass11;

import java.util.ArrayList;

public class Sumofarraylist {

	public static void main(String[] args) {

		ArrayList<Object> list=new ArrayList<Object>();
		list.add("vitthal");
		list.add("50");
		list.add(50);
		list.add(100);
		list.add('#');
		int sum=0;
		for(Object k:list)
		{
			try
			{
				sum=sum +Integer.valueOf(k.toString());
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println(sum);
	}

}
