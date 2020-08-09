package javaBasics;

import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(  A.length()+ B.length());
		
		if( A.compareTo(B) >0) {
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		char first= A.charAt(0);
		String capital =String.valueOf(first);
		String capital_string=  capital.toUpperCase();
		
		A.replace(A.charAt(0), capital_string.charAt(0));
		 
		String secondCapital = String.valueOf(B.charAt(0)).toUpperCase();
		B.replace(B.charAt(0), secondCapital.charAt(0));
		
		String final_value = A.replace(A.charAt(0), capital_string.charAt(0)) + " "+B.replace(B.charAt(0), secondCapital.charAt(0));
		System.out.println(final_value);
		
	}
	
	
	
	
}
 