package javaBasics;

public class Gcg {

	public static void main(String[] args) {
		int m = 16;
		int n = 2;
		for (; m != n;) {

			if (m > n) {
				m = m - n;
				System.out.println(" ## ");
			} else {
				n = n - m;
			}

		}

	}

}
