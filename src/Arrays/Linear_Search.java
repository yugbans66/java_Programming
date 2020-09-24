package Arrays;
import java.util.Scanner;
public class Linear_Search { 
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] arr = new int [size];
		for (int i = 0 ; i < size ; i++) {
			 arr[i] = s.nextInt();
		}
		return arr;
		
	}
	public static int LinearSearch (int [] arr , int num ) {
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == num) {
				return i;
			}
			i++;
			
		}
		return -1;
		
	}
public static void main(String[] args) {
	int [] input = takeinput();
	Scanner s = new Scanner (System.in);
	int no = s.nextInt();
	int ans = LinearSearch(input , no);
	System.out.println(ans);
}
}
