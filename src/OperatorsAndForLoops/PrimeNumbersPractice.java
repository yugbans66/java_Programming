package OperatorsAndForLoops;
import java.util.Scanner;
public class PrimeNumbersPractice {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n;
	n = s.nextInt();
	int i = 2;
	while (i <= n) {
		boolean isprime = true;
		int j = 2;
		while (j <= i-1) {
			if (i%j == 0) 
			
				isprime = false;
				j++;
		}
		if (isprime) 
			System.out.println(i);
			i++;
		
		
	}
	
}
}
