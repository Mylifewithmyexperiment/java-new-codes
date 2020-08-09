package javaBasics;

public class ThreadImpement  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ridghilrud gh");
		int a = (int) Math.pow(2, 4);
		System.out.println(   a );
	}

	public static void main(String[] args) {
		
		ThreadImpement fsfd = new ThreadImpement();
		Thread t = new Thread(fsfd);
		t.start();
		
	}
	
	
	
	
}
