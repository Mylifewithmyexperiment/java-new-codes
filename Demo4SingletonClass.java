package demo;

public class Demo4SingletonClass {
	
	private static  Demo4SingletonClass f=null;
	
	//A private Constructor prevents any other
    //class from instantiating.
	
	private Demo4SingletonClass ()
	
	
	{
		//System.out.println(" I am in default ");
	}
	
	public Demo4SingletonClass getInstance()
	{
		if(f==null)
		{
			f=new Demo4SingletonClass();
			
		}
		return f;
	}
	
	void genralMethod()
	{
		System.out.println( " I am in general method");
	}
	
	public static void main(String args[]) {
		
		Demo4SingletonClass obj = new Demo4SingletonClass().getInstance();
		obj.genralMethod();
	
		
	}
	
	

}
