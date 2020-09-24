package Assignment_1;
import java.util.Scanner;

public class Sum_And_Product {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n,c;
	n = s.nextInt();
	c = s.nextInt();
	if (c == 1) {
		int sum = 0;
		int i = 1;
		while (i<=n) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}else if (c == 2) {
		int pro = 1;
		int i = 1;
		while (i <= n) {
			pro = pro*i;
		i++;
		}
		System.out.println(pro);
	}
	
}
}
