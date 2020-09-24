package Assignment_1;
import java.util.Scanner;
public class Terms_Of_AP {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n;
	n = s.nextInt();
	s.close();
	int i = 1;
	int z = 1;
	while (i<= n) {
		
	int	j = 3*z + 2;
		if (j % 4 == 0) {
			i++;
			z++;
			
			continue;
			
		}
		System.out.print(j + " ");
		i++;
		z++;
	}
}
}
