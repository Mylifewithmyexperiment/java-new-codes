package javaBasics;

class Arithmetic {
	int add(int a, int b) {
		return a + b;
	}

}


class Adder extends Arithmetic{
	
}



public class Solutions {
	public static void main(String[] args) {
		// Create a new Adder object
		Adder a = new Adder();

		// Print the name of the superclass on a new line
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

		// Print the result of 3 calls to Adder's `add(int,int)` method as 3
		// space-separated integers:
		System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
	}
}

/**
 * 
 * public static void main(String[] args) { String[] s1 =new String[3]; int a
 * []= new int[3]; Scanner sc = new Scanner(System.in);
 * 
 * for(int i=0;i<3;i++){ s1[i]=sc.next();
 * 
 * a[i]=sc.nextInt(); //Complete this line
 * 
 * } System.out.println("================================"); for(int
 * i=0;i<3;i++){ System.out.print(s1[i]); space(s1[i],25);
 * System.out.println(a[i]);
 * }System.out.println("================================");
 * 
 * }
 * 
 * 
 * public static void space(String s,int size) { // int size = 15; String str
 * =""; // System.out.println(s.length()); int remainingSizze = size-s.length();
 * for(int i=0;i<remainingSizze;i++) { str+=" "; } System.out.print(str); }
 * 
 * 
 * 
 * 
 * 
 **/

/**
 * 
 * class Sports {
 * 
 * String getName() { return "Generic Sports"; }
 * 
 * void getNumberOfTeamMembers() { System.out.println("Each team has n players
 * in " + getName()); } }
 * 
 * class Soccer extends Sports {
 * 
 * @Override String getName() { return "Soccer Class"; }
 * 
 * @Override void getNumberOfTeamMembers() { System.out.println("Each team has
 *           11 players in " + getName()); }
 * 
 * 
 * 
 *           } public class Solutions {
 * 
 *           public static void main(String []args){ Sports c1 = new Sports();
 *           Soccer c2 = new Soccer(); System.out.println(c1.getName());
 *           c1.getNumberOfTeamMembers(); System.out.println(c2.getName());
 *           c2.getNumberOfTeamMembers(); }
 * 
 *           }
 * 
 * 
 **/
