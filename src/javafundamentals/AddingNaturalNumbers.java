package javafundamentals;
import java.util.Scanner;


public class AddingNaturalNumbers {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int sum = 0;
	int n;
	int i = 1;
	n = s.nextInt();
	while (i <= n) {
		sum = sum +i;
		i= i+1;
		
	}
	System.out.println(sum);
	
}
}
