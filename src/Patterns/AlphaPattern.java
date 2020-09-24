
package Patterns;
import java.util.Scanner;

public class AlphaPattern {
public static void main(String[] args) {
	int n ;
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	int i = 1;
	while (i <= n) {
		int j = 1;
		char StartingChar = (char)('A' + i - 1);
		while (j <= i) {
			
		System.out.print(StartingChar);
		StartingChar = (char)(StartingChar );
		j++;
	}
	System.out.println();
	i++;
	
}
}
}

