package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		if (o1 < o2) {
			return -1;

		} else if (o1 > o2) {
			return +1;
		} else {
			return 0;
		}

	}

}

public class FunctionalInterfaces {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>();
		l.add(3);
		l.add(7);
		l.add(0);
		l.add(9);

		System.out.println(l);
		Comparator<Integer> c=( i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;  
		
		Collections.sort(l, c);
		
		//Collections.sort(l, new MyComparator());
		System.out.println(l);

	}

}
