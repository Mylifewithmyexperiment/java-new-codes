package javaBasics;

import java.util.HashSet;
import java.util.Set;

public class ArrayMerge extends Thread {

	@Override
	public void run() {
		super.run();

		try {
			System.out.println("sdbdrgsrdgsdg********************************");
			Thread.sleep(1000);

			// notify();
			System.out.println("    fbdfgbdgbrdvgd");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		ArrayMerge obj = new ArrayMerge();
		obj.start();

		
		Set<Integer> d= new HashSet<>();
		d.add(6);
	}

}
