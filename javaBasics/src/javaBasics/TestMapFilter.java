package javaBasics;

import java.util.HashMap;
import java.util.Map;
 
import java.util.stream.Collectors;

public class TestMapFilter {

	public static void main(String[] args) {

		
		Map<Integer, String> map = new HashMap<>();
		 
		 map.put(1, "apple");
		 map.put(2, "amazon");
		 map.put(3, "airtel");
		 
		 
		 // using java stream
		 
		 String result="";
		 
		 result = map.entrySet()
				 .stream()
				 .filter(maps-> "apple" .equals(maps.getValue()) )
 		.map(maps->maps.getValue() )
 		.collect(Collectors.joining());
		
	System.out.println(result);
	
	
	
	}
	
}
