package Functions;
import java.util.Scanner;

public class Practice_faranhiet_question {
public static int fahrenheit(int start , int end , int W ) {
	int i = start;
	int fact = 1;
	while (i <= end) {
		fact = (5/9)*(i-32);
		i += W;
		System.out.println(fact);
		
	}
	return fact;
}
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	int n = s.nextInt();
	int r = s.nextInt();
	int w = s.nextInt();
			
 fahrenheit(n , r , w); 
}

}