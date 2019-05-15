public class Theory {

	public static void main(String[] args) {

		String s1 = "abc";

		String s2 = s1;

		s1 += "d";

		System.out.println(s1 + " " + s2 + " " + (s1 == s2));

		StringBuilder sb1 = new StringBuilder("abc");

		StringBuilder sb2 = sb1;

		sb1.append("d");
		System.out.println(sb1);

		System.out.println(sb2);

		System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));

	}
}