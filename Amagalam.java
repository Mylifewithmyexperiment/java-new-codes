package test;

import java.util.Scanner;

public class Amagalam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t= scanner.nextInt();
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		// System.out.println("value of s1 "+s1);
		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {

				char a = s1.charAt(i);
				char b = s2.charAt(j);
				boolean s = a == b;
				if (s) {
					count++;
					// System.out.println("String matched" +s1.charAt(i));
				}

			}

		}
		int total_length = s1.length() + s2.length();
		// System.out.println(" Count "+count);
		System.out.println((total_length - 2 * count));

		scanner.close();
	}

}
