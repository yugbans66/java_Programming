package Arrays;
import java.util.Scanner;
public class Array_Insertion {
	public static int[] takeinput1() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] arr = new int [size];
		for (int i = 0 ; i < size ; i++) {
			 arr[i] = s.nextInt();
		}
		return arr;
		
	}
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
		int [] input1 = takeinput1();
		int [] input2 = takeinput2();
		for (int i = 0 ; i< input1.length ; i++) {
			for (int j = 0 ;j< input2.length ; j++) {
				if (input1[i] == input2[j]) {
					System.out.println(input1[i]);
					input2[j] = Integer.MIN_VALUE;
					
				}
			}
		}
	}
}
