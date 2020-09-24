package Practice_Problems;
import java.util.Scanner;
public class Square_Root {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int i;
	int n = s.nextInt();
	for (i = 0 ; i*i <= n ; ++i) ;
	System.out.println(i-1);
		
	
}
}
