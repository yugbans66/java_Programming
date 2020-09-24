package Patterns;
import java.util.Scanner;
public class StarPatternQuestion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while(j <= n-i) {
				System.out.print(" ");
				j++;
			}
			int val = i;
			j = 1;
			while (j <= i) {
				System.out.print(val);
				j++;
				val++;
				
			}
			int p = i ;
			j = 1;
			while (j <= i-1) {
				System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;
			
		}
			
	}

}
