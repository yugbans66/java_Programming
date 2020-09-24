package Strings_And_2D;
import java.util.Scanner;
public class Row_Wise_Sum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int M = s.nextInt();
		int N = s.nextInt();
		int arr[][] = new int [M][N]; 
		for (int i = 0 ; i<M ; i++) {
			for (int j = 0 ; j <N ; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		int sum[] = new int [M];
		for ( int i = 0 ; i <M ; i++) {
			for(int j = 0 ; j < N ; j++) {
				sum [i] += arr[i][j];																																																																		
			}
			
			}
		for (int n = 0 ; n < M ; n++) {
			
			System.out.print(sum[n] + " ");	
		}
	}

}
