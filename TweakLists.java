import java.util.*;

public class TweakLists {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("z");
		myList.add("x");
		myList.add(1, "y");
		myList.add(0, "w");
		System.out.println(myList);

		myList.clear();
		myList.add("b");
		myList.add("a");
		myList.add("c");
		System.out.println(myList);
// [b, a, c]
		
		System.out.println(myList.contains("a") + " " + myList.contains("x"));
		System.out.println("get 1: " + myList.get(1));
		System.out.println("index of c: " + myList.indexOf("c"));
		myList.remove(1);
// remove "a"
		System.out.println("size: " + myList.size() + " contents: " + myList);
	}
}