package javafundamentals;
import java.util.Scanner;

public class WhileLoop {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int n;
	
	n = s.nextInt();
	int i = 1;
	while (i<=n) {
		System.out.println("hello");
	      i = i+1;
	}
	
}
}
