package Practice_Problems;
import java.util.Scanner;
public class Reverse_Of_a_Number {
public static void main(String[] args) {
	int n=0 ;
	int r = 0;
	Scanner s = new Scanner(System.in);
	 n = s.nextInt();
	for (;n != 0;) {
		r = r*10;
		r = r+ n%10;
		n = n/10;
	}
	System.out.println(r);
}
}
