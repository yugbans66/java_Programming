package Patterns;
import java.util.Scanner;


public class SquarePatternPractice {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n;
	n = s.nextInt();
	int i = 1;
	while(i <= n) {
		int j = 1;
		while (j <=n) {
			System.out.print(n);
			j++;
		}
		System.out.println();
		i++;
	}
}
}
