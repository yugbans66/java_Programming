/* 
   Ques. Print the following pattern for the given number of rows.
   Pattern for N = 5
   E
   DE
   CDE
   BCDE
   ABCDE
   Input format :
   N (Total no. of rows)
*/

package Patterns;
import java.util.Scanner;

public class  CharacterPatternQuestion {
public static void main(String[] args) {
	int n ;
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	int i = 1;
	while (i <= n) {
		int j = 1;
		char StartingChar = (char)('A' + n - i);
		while (j <= i) {
			
		System.out.print(StartingChar);
		StartingChar = (char)(StartingChar + 1);
		j++;
	}
	System.out.println();
	i++;
	
}
}
}

