package javafundamentals;

import java.util.Scanner;

public class Conditionals {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a , b;
		 a= s.nextInt();
		 b= s.nextInt();
		 
		 if( a>b) {
			 System.out.println("First num is Greater");
		 }else {
			 System.out.println("Second Number is Greater");
			 // there are no semicollons in the if else conditionals because they are conditionals. 
		 }
	}

}
