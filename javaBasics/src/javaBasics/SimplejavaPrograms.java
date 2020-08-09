package javaBasics;

import java.util.StringTokenizer;

public class SimplejavaPrograms {

	class G {

	}

	public static void main(String[] args) {

		stringTokenizer();
		String s1 = "Indra dev jc kjhd";
		String[] ss = s1.split(" ");
		System.out.println("sfgwergreg 	" + ss[0] + "   " + ss[1] + " " + ss[2]);
		SimplejavaPrograms simplejavaPrograms = new SimplejavaPrograms();
		System.out.println("Class::::::;;" + simplejavaPrograms.toString());
		SimplejavaPrograms simplejavaProgramsdew1 = new SimplejavaPrograms();
		System.out.println("Class::::::;;" + simplejavaProgramsdew1.toString());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "gjh";
	}

	private static void stringTokenizer() {
		// TODO Auto-generated method stub
		StringTokenizer s = new StringTokenizer("My name is anthony Dechousta", " ");

		while (s.hasMoreTokens()) {

			System.out.println(s.nextToken());

		}

	}

}
