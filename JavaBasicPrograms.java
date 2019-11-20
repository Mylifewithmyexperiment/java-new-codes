package test;

public class JavaBasicPrograms {

	protected int ss=5;
	public int g=66;
	// private int k=44;
	 
	
	public static void main(String[] args) {
		evenOdd();
		factorial();
		primeNumber();
		largestAmongNdigit();
		SwapTwoNumber();
		SwapWithoutThirdVariable();
		FibbonacciSeries();
		Palindrome();
		PascalTriangle();
		 
	}

	public static  void PascalTriangle() {

	}

	private static void Palindrome() {

	}

	private static void FibbonacciSeries() {
              
		
	}

	private static void SwapWithoutThirdVariable() {
		// TODO Auto-generated method stub

	}

	private static void SwapTwoNumber() {
	 

	}

	private static void largestAmongNdigit() {
		
		
		
	}

	private static void primeNumber() {
		int n = 7;
		int flags = 0;
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if ((n % j == 0)) {
					flags = 1;
				}
			}
		}
		System.out.println(flags);
		
		if (flags==0) {
			System.out.println("prime no");
		}
		else {
			System.out.println("Non prime");
		}

	}

	private static void factorial() {
		int n = 5;
		int pdt = 1;
		for (int i = 1; i < n; i++) {
			pdt = pdt * i;

		}
		System.out.println(pdt);
	}

	private static void evenOdd() {
		int n = 3;
		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		System.out.println((n%2==0)?"Even":"Odd");
		
		
	}

}
