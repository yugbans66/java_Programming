package Patterns;
import java.util.Scanner;

public class PatternPractice {

public static void main(String[] args) {
	int n ;
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	int i = 1;
	while (i <= n) {
		int j = 1;
		while (j <= n) {
			
		System.out.print(n-j+1);
		j++;
	}
	System.out.println();
	i++;
	
}
}}

