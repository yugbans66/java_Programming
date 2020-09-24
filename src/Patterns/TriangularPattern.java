package Patterns;
import java.util.Scanner;
public class TriangularPattern {

	public static void main(String[] args) {
		int n ;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int i = 1;
		int t=1;
		while (i <= n) {
			int j = 1;
			
			while (j <= i) {
				
			System.out.print(t);
			j++;
			t++;
		}
		System.out.println();
		i++;
		
	}
	}}



