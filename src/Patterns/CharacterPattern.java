
package Patterns;
import java.util.Scanner;

public class CharacterPattern {
public static void main(String[] args) {
	int n ;
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	int i = 1;
	while (i <= n) {
		int j = 1;
		while (j <= n) {
			
		System.out.print((char)('A' + j - 1));
		j++;
	}
	System.out.println();
	i++;
	
}
}
}
