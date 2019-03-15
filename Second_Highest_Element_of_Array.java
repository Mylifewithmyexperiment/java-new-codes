

import java.util.*;

public class Second_Highest_Element_of_Array {

	public static void main (String args[]) {		
		int abc_arr[ ]  = {101,99,9,9,0,1,7,0,100,-1};
		System.out.println("The initial array is " +abc_arr);
	     Arrays.sort(abc_arr);
	     // now the previous defined array has been updated with sorted one
	    String sort_abc  =Arrays.toString(abc_arr);
	  	System.out.println("The sorted array abc is "+ sort_abc);
		System.out.println("The second highest element is "+abc_arr[abc_arr.length-2]);
		
	}
	
}
	

