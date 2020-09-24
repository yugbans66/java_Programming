package javafundamentals;

import java.util.Scanner;

public class nestedIFELSE {
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
    int a,b;
    a = s.nextInt();
    b = s.nextInt();
    
    if(a > b) {
    	System.out.println("First Num Is Greater");
    }else {
    	if (b>a) {
    		System.out.println("Second Num Is Greater");
    		
    	}else {
    		System.out.println("Both Are Equal");
    	}
    }
    	

	}
}
