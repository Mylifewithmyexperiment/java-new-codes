package test;

public class Facebook {
	static {
		main(new String[] { "[Static call]" });
	}

	public static void main(String[] args) {
		System.out.println("**************" + args.length);
		System.out.println("***&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&******" + args.length);
		System.out.println(args.length > 0 ? args[0] : "[From main]");
		
		System.out.println("***^6666666666666666666666666666666666666666666666666*****" + args.length);
	}
}

/**
1st time main method from static block is called so arg length is 1 

but second the system defined main method is called so at that time the arg length is 0 . 
Therefore, the arg length is 0 and ternary operator prints the result accordingly.

**/