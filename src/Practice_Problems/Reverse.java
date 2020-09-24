package Practice_Problems;
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = 0;
	int r = 0;
	n = s.nextInt();
	for ( ; n != 0 ;) {
		r = r*10;
		r = r + n%10;
		n = n/10;
	}
	System.out.println(r);
}
}
