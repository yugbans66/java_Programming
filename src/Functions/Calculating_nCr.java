package Functions;
import java.util.Scanner;
public class Calculating_nCr {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n;
	int r;
	n = s.nextInt();
	r = s.nextInt();
	int factN = 1;
	
	for (int i = 1; i <= n; i++) {
		factN = factN * i;
	}
	int factR = 1;
	for (int i = 1; i <= r ; i++) {
		factR = factR * i;
	}
	int factNR = 1;
	for (int i = 1; i <= n-r ; i++) {
		factNR = factNR * i;
	}
	int result = factN / (factR * factNR);
	System.out.println(result);
		
			
}
}
