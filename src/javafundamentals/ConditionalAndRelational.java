package javafundamentals;

import java.util.Scanner;

public class ConditionalAndRelational {
	
	public static void main(String[] args) {	
	
	Scanner s = new Scanner(System.in);
       int a , b;
       a = s.nextInt();
       b = s.nextInt();
       if (a>0 && b>0) {
    	   System.out.println("Positive");
       }else {
    	   System.out.println("Negative");
       }
       
	}
        
	
}
