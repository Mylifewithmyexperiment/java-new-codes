
public class Boxing {

	public static void main(String[] args) {
		
		Integer i3 = 10;
		Integer i4 = 10;
		if(i3 == i4) System.out.println("same object");
		if(i3.equals(i4)) System.out.println("meaningfully equal");
		
		
		
		
		Integer s= new Integer(44);
		int d= s.intValue();
		d++;
		//Integer r= d;
		s= new Integer(d);
		System.out.println("unwrapped integer is " +s);
		
		
		// term new Integer will lead to 
		
	}
	
	
	
	
	
	
}
