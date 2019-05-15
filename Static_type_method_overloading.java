
public class Static_type_method_overloading {

	
	static class A{
		  void show( )
		{
			System.out.println("In parent Class");
		}
	}
	
 static	class B extends A{
	  void show()
		{
			System.out.println("in base class");
		//in method over Riding we provide specific implementation of methods
		//in the base class 
		}
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		a.show();
		b.show();
		/*
		 * A.show(); B.show();
		 */
		
	}
	
	
}