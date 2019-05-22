
public class Finalizexample {

	public void finalize() throws Throwable{
		System.out.println("Object garbage collected");
	}
	
	public static void main(String args[]) {
		Finalizexample finalizexample = new Finalizexample();
		Finalizexample asd = new Finalizexample();
		 asd= null;
		//finalizexample = null;
		System.gc(); // it is a calling reference to finalize method
		System.out.println(" Main complete");
	}
	
	
}
/**
Whenever we assign any  reference variable to null and call the system.gc 
then finalize method is called. 
finalize method is called by the compiler when it see that any object is 
no  

**/