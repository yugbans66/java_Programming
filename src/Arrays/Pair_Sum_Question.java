package Arrays;
import java.util.Scanner;

public class Pair_Sum_Question {
	public static int[] takeinput2() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] arr = new int [size];
		for (int i = 0 ; i < size ; i++) {
			 arr[i] = s.nextInt();
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int[] input = takeinput2();
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i = 0 ; i < input.length ; i++) {
			for (int j = i+1 ; j < input.length ; j++ ) {
				if (num - input[i] == input[j]) {
					if (input[i]<input[j]) 
						System.out.println(input[i] + " , " + input[j]);
					else System.out.println(input[j] + " , " + input[i]);
				}
			}
		}
	}

}
