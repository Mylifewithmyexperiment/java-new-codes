import java.util.HashMap;

public class HAshmap {

	public static void main(String[] args) {

		HashMap<Integer, String> ar = new HashMap();
		ar.put(1, "hvasd");
		ar.put(1, "value");
		ar.put(2, "sdv");
		ar.put(null, null);
		System.out.println(ar);

		if (ar.containsKey(1)) {
			System.out.println(" Key is present and we are removing that ");
			System.out.println("new array " +ar.remove(1));
			System.out.println(ar);
			
		}
	}

}
