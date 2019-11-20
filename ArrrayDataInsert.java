package test;

/*
    program to insert data in array 
 */
public class ArrrayDataInsert extends JavaBasicPrograms {
 
	
	public static void main(String[] args) {
		
		ArrrayDataInsert arrrayDataInsert = new ArrrayDataInsert();
	int td=	arrrayDataInsert.ss;
		
		int[] a = { 1, 3, 4, 6 ,7,5,6};
		int element = 5;
	//	int pos = 1;
		for (int i = 0; i < a.length; i++) {
		    
			if(a[i] == element) {
				
				a[i]=a[0];
				 
			}
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					a[i]=a[0];
				    a[0]=a[j]; 
				}
			}
			
		}
		
		
		for (int i = 1; i < a.length; i++) {
			System.out.print( " "+ a[i]);
		}
    

	}

}




/**
		 // adding element
		if (pos >= 0 && pos < a.length) {
			a[pos] = element;
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
		} else {
			System.out.println("Element can't be added");
		}

          //deleting element by position
		if (pos >= 0 && pos < a.length) {
			a[pos] =a[0];
			for (int i = 1; i < a.length; i++) {
				System.out.print(a[i]);
			}
		} else {
			System.out.println("Element can't be deleted");
		}
		 
 
**/