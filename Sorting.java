import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class Sorting {
	public static void main(String[] args) {
		
		String s= "cats and hats";
		
		String []k = s.split(" ");
		System.out.println(k[0]);
char firstletter=	k[0].charAt(0);
Arrays.sort(k);
k[0].toLowerCase();
System.out.println(k[0].toLowerCase().toUpperCase());
System.out.println(" "+k[0]+" "+ k[1]+" "+ k[2]);


System.out.println(firstletter);

		
		if( (k[0].length()<k[1].length()) & (k[0].length()< k[2].length() ))
		{
			if(k[1].length()<k[2].length())
			{
				System.out.print(" "+k[0]+ " " +k[1] +" "+k[2] );
			}
			
			else
			{
				System.out.println(k[0]+ " "+ k[2]+" "+k[1]);
			}
			
		}
		
		if((k[1].length()<k[0].length() ) & ( k[1].length()<k[2].length())  )
		{
			if(k[0].length()<k[2].length())
			{
				System.out.println(" " +k[1]+ " " +k[0] +" "+k[2]);
			}
			else
				System.out.println(" "+k[1]+ " "+ k[2]+ " "+k[0]);
		}
		
	}

}
