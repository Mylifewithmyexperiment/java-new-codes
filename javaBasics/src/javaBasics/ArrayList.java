package javaBasics;

import java.util.LinkedList;
import java.util.Vector;

public class ArrayList {

	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>(11);
		System.out.println("Vector size is " +v.size());
		
		v.add(4);
		System.out.println("vector capacity is  " +v.capacity());	
		System.out.println("Vector new size is " +v.size());
		
		// linkedList
		LinkedList< Integer> linkedList = new LinkedList<>();
		linkedList.add(5);
		linkedList.add(77);
		linkedList.addFirst(66);
		
		synchronized (linkedList) {
			System.out.println("size of linked list :- " + linkedList.size());
			System.out.println("Linked list is :- " +linkedList   );
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
