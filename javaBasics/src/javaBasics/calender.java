package javaBasics;

public class calender {

	public static void main(String[] args) {

		String s = "madam";
		boolean flag = false;
		int len = s.length();
		for (int i = 0; i < len; i++) {

			/*
			 * if (s.charAt(i) == s.charAt(len - 1 - i)) {
			 * 
			 * flag = true; } else { flag = false; break; }
			 */
			 
			flag = s.charAt(i) == s.charAt(len - 1 - i) ? true : false;
			i = flag == true ? i : len + 1;

		}

		/*
		 * if (flag) { System.out.println("Yes"); } else { System.out.println("No"); }
		 */

		System.out.println(flag == true ? "yes" : "No");
	}

}
