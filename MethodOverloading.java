
/**
 * method overloading with different return type
 * 
 *
 */

public class MethodOverloading {
	
	// Simple one
	void print(int a ) {

		System.out.println("Method with integer parameter");
		
	}
	
	void print()
	{
		System.out.println("Default method");
		
	}
	
	// with different return type
	int show(int u)

	{
		int a= 5;
		return a;
		
	}
	
	void show()
	{
		System.out.println("default method with different return type ");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Sterlite");
		
		// first we make reference of class
		MethodOverloading methodOverloading;
		// now we create object of that class
		methodOverloading= new MethodOverloading();
		 
		// now we call the method inside class
		methodOverloading.print(); // default call
		methodOverloading.print(4);
		
		
		methodOverloading.show();
		
		  
	}
	

}
