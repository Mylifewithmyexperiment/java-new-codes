package javaBasics;

public class SingletonClass {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			Pqr.getInstance();
	}

}

class Pqr {

	static Pqr ss = null;
	static Pqr getInstance() {
		System.out.println("Call::");
		if (ss == null) {
			ss = new Pqr();
			return ss;
		} else {
			return ss;
		}
	}
	private Pqr() {
		System.out.println(Pqr.class + " hello");
	}

}