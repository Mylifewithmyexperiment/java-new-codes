import java.util.*;
public class TestSort {
/**
 * @param args
 * Array list can add elements dynamically,
 * can add primitive and non-primitive type elements
 */
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("ranchi");
		arrayList.add("Ahmedabad");
		arrayList.add("Patna");
		arrayList.add("Pune");
		arrayList.remove(2);
		arrayList.add(2, ":patnaa");
		
		System.out.println("Unsorted arrayList " +arrayList);
		Collections.sort(arrayList);
		System.out.println("sorted Array List "+arrayList);
		
	}
	
}


