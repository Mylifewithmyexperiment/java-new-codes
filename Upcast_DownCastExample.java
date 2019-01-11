package demo;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Upcast_DownCastExample {
	ArrayList<String > msg= new ArrayList<>();
	
	
	void print2()
	{
		msg.add("abstract class array list");
		msg.add("abstract class array list 1 ");
		Iterator<String > itr = msg.iterator(); 
		while(itr.hasNext()) 
		{
			System.out.println("the message are " + itr.next());
		}
		
		System.out.println("in abstract class" );
	}

}
