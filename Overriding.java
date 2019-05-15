 

  public class Overriding {

	
	
		void show() {
			System.out.println("In parent class");
		}
	
	
	class Child extends Overriding{
		
		void show() {
			System.out.println("In child class");
		}
		void show1() {
			System.out.println("For checking overloading in Parent Class");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Overriding p= new Overriding();
		 
	 
	}
	 
	
	
	
} 