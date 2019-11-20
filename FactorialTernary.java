package test;

import java.util.Scanner;

public class FactorialTernary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		/*int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

		*/
		// Swap two numbers
		
		//int n2 =sc.nextInt();
		 
		//System.out.println( (n>n2)?n:n2 );
		
		
		//leap year
		
		int yr=sc.nextInt();
		
		System.out.println( (yr%4==0)?"Leap Year":"Non Leap Year"  );
		
		sc.close();

	}

}
