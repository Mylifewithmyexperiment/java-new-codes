package test;

import java.util.Scanner;

public class EvenUnary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String flag = (sc.nextInt() % 2 == 0) ? "Even" : "Odd";
		System.out.print(flag);
		sc.close();

	}
}



