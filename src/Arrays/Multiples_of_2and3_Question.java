package Arrays;
import java.util.Scanner;
public class Multiples_of_2and3_Question {
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] arr = new int [size];
		for (int i = 0 ; i < size ; i++) {
			 arr[i] = s.nextInt();
		}
		return arr;
		
	}
public static void main(String[] args) {
	int sum = 0;
	int input [] = takeinput();
	for (int i = 0; i < input.length ; i++) {
		if( input[i]%2 == 0) {
			sum = sum + input[i];
		}else if ( input[i]%3 == 0) {
			sum = sum + input[i];
		}
	}
System.out.println(sum);	
}

}
