import java.util.*;

class SetTest {
	public static void main(String[] args) {
		boolean[] ba = new boolean[5];
// insert code hereSet s = new HashSet()
		Set<Object> s = new HashSet<Object>();
		ba[0] = s.add("a");
		ba[1] = s.add(new Integer(42));
		ba[2] = s.add("b");
		ba[3] = s.add("a");
		ba[4] = s.add(new Object());
		for (int x = 0; x < ba.length; x++)
			System.out.print(ba[x] + " ");
 
		 
	}
}

// above program shows that duplicate element can not be added in sets.