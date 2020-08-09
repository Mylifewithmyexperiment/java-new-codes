package javaBasics;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int q, a, b, n;
		double firstCase = 0;
		System.out.println("Enter value of a::");
		a = scanner.nextInt();
		System.out.println("Enter value of b::");
		b = scanner.nextInt();
		System.out.println("Enter value of n::");
		n = scanner.nextInt();
		
		if (a >= 0 & a <= 50 & b >= 0 & b <= 50 && n>=1 && n<=15) {
			firstCase = a+Math.pow(2, 0)*b;
			System.out.println("Case of "+0+" "+firstCase);
		 	for(int i=1;i<n;i++)
			{
					firstCase +=Math.pow(2, i)*b;
					System.out.println("Case of "+i+" "+firstCase);
				
			}
			
		 
			
          /* int exp = 0;
			for (int i = 0; i < n; i++) {
				 for (int j = 0; j <= i; j++) {
					 exp = (int)Math.pow(2, j)*b;
					 
				}
				int output= a+exp;
				System.out.println(output);
				
			}
			
		}*/
		}
		
		
	}
}
	/*	
		System.out.println("q vlaue +"+q );
		try {
			if (q >= 0 & q <= 1000) {
				for (int i = 0; i < q; i++) {
					scanner.next();
					String s = scanner.nextLine();

					String abc[] = s.split(" ");
					scanner.next();
					int arr[] = new int[abc.length];

					for (int j = 0; j < abc.length; j++) {

						arr[j] = Integer.parseInt(abc[j]);

					}
					a = arr[0];
					b = arr[1];
					n = arr[2];
					

					System.out.println("here");
					a= 0;
					 b=2;
					 n=10;
					 String s= String.valueOf(a);
					 System.out.println(s);
					if (a >= 0 & a <= 50 & b >= 0 & b <= 50) {
						for (int j = 0; j < n; j++) {

							int expression = (int)  Math.pow(2, j)*b;

							
							System.out.print( a + expression +" ");

						}
						 

					}System.out.println();

				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();

	}
}
*/