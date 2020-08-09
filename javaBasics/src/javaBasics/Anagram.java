package javaBasics;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "abj";
		String s2 = "abj".toLowerCase();
		int count1 = 0;
		int count2 = 0;

		System.out.println(s1.substring(2));
		if (s1.length() != s2.length()) {
			System.out.println("Not Anagram");

		} else {
			for (int i = 0; i < s1.length(); i++) {
				char c = s1.charAt(i);

				for (int j = 0; j < s1.length(); j++) {

					if (c == s1.charAt(j)) {
						count1++;
					}

					if (c == s2.charAt(j)) {
						count2++;
					}

				}

				if (count1 == count2) {

					continue;
				} else {
					System.out.println("Not Anagram");
					break;
				}

			}
			if (count1 == count2) {
				System.out.println("Anagram");
			}

		}

	}

}
