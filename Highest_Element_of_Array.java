
public class Highest_Element_of_Array {

	

	/**
	 * @param args
	 */
	public static void main (String args[]) {
		
		int abc_arr[ ]  = {101,99,9,9,0,1,7,0,100,-1};
		
		int max=abc_arr[5];
		
		for (int i = 0; i < abc_arr.length; i++) {
			
			if (abc_arr[i]>=max) {
				max =abc_arr[i];
				System.out.println("local max is " +max);
				
			}
			 
			
			
		}
		System.out.println("The maximum value of array is " + max);
		
		
	}

	
}
