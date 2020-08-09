package javaBasics;

import java.util.Scanner;

public class Solution {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
       
		int a[][] = new int [2][2];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(" ** "  + i +"#### "+j);
			}
		}
		
	}

}

/*
 * public static void main(String[] args) { int n = scanner.nextInt(); boolean
 * flag=false; if (n == 0 || n == 1) { flag=true; } int m = n / 2; for (int i =
 * 2; i <= m; i++) {
 * 
 * if (n%i==0) { flag=true; }
 * 
 * 
 * } if (flag) { System.out.println("Not Prime"); } else {
 * System.out.println("Prime"); }
 * 
 * scanner.close();
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

/**
 * 
 * interface AdvancedArithmetic { int divisor_sum(int n); }
 * 
 * class MyCalculator implements AdvancedArithmetic {
 * 
 * @Override public int divisor_sum(int n) {
 * 
 *           int sum = 0; if (n <= 1000) {
 * 
 *           for (int i = 1; i <= n; i++) { sum = (n % i == 0) ? sum = sum+i :
 *           sum; }
 * 
 *           }
 * 
 *           return sum;
 * 
 *           }
 * 
 *           }
 * 
 * 
 * 
 * 
 *           public static void main(String []args){ MyCalculator my_calculator
 *           = new MyCalculator(); System.out.print("I implemented: ");
 *           ImplementedInterfaceNames(my_calculator); Scanner sc = new
 *           Scanner(System.in); int n = sc.nextInt();
 *           System.out.print(my_calculator.divisor_sum(n) + "\n"); sc.close();
 *           } /* ImplementedInterfaceNames method takes an object and prints
 *           the name of the interfaces it implemented
 */
/*
 * static void ImplementedInterfaceNames(Object o){ Class[] theInterfaces =
 * o.getClass().getInterfaces(); for (int i = 0; i < theInterfaces.length; i++){
 * String interfaceName = theInterfaces[i].getName();
 * System.out.println(interfaceName); } }
 */
