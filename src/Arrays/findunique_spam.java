package Arrays;
import java.util.Scanner;
public class findunique_spam {
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		size = 2*size + 1;
	    int [] arr = new int [size];
	    for (int  i = 0 ; i < size ; i++) {
	    	arr[i] = s.nextInt();
	}
	    return arr;
	}
	public static int findunique(int[] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			int j;
			for (j = 0 ; j < arr.length ; j++) {
				if ( i != j) {
					if ( arr[i] == arr[j]) {
						break;
					}
				}
			}
			if (j== arr.length) {
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}
	public static void main(String[] args) {
		takeinput();
		int lar =  findunique(arr);
	}
}