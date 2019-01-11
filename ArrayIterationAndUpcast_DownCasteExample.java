package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ArrayIterationAndUpcast_DownCasteExample extends Upcast_DownCastExample implements Runnable, Show {

	void arrayIteration() { // to code safely you have to delclare it in method and call that method
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		
		
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(" list elements of demo3 are :-  " + itr.next());
		}
	}

	void print2() {

		arrayIteration();

		System.out.println("Array list message ");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("thread elements");
			Thread.sleep(2000);
			arrayIteration();
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void interfaceMethod(String name) {
		// TODO Auto-generated method stub
	    String n=	this.name1;
		System.out.println(" the interfacce name is fetched from interface is  " + n);
		System.out.println("the name fetched from main method is  "+name);
		
	}

	public static void main(String args[]) {

		Upcast_DownCastExample demo2 = (Upcast_DownCastExample) new ArrayIterationAndUpcast_DownCasteExample(); // upcasting
		demo2.print2();

		ArrayIterationAndUpcast_DownCasteExample demo3 = new ArrayIterationAndUpcast_DownCasteExample();
		Thread t1 = new Thread(demo3); // in runnable we pass reference of class
		t1.start();

		demo3.interfaceMethod("from main this name is passed");
 
		
	}

}
