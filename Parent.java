
  class Parent1 {

	
	void show () {
		System.out.println("parent object");
	}
}
	
	class Child extends Parent1{
		void show () {
			System.out.println("child object");
		}
		
	}
	
	class GrandChild extends Child{
		void show() {
			System.out.println("Grand child object");
		}
		
	}
	
	
public	class Parent{
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		Parent1 p1 = new Child();
		Child p2 = new GrandChild();
		
		
		 p.show();
		 
		 p1.show();
		 
		 p2.show();
		
	}
	
}
