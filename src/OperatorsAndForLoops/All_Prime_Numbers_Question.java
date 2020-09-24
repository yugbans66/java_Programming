package OperatorsAndForLoops;
import java.util.Scanner;

public class All_Prime_Numbers_Question {
public static void main(String[] args) {
	
	 Scanner s = new Scanner (System.in);
	 int n ;
	 n = s.nextInt();
	
	 
	 for (int i = 3; i <= n ; i+=2) {
		 for (int j = 3 ; j < i ; j++) {
			int r = j% i;
			 if (r == 0 ) {
				 return;
			 }
			
		 }
		 System.out.println(i);
			 
		 
	 }
		 
	 
}
}
