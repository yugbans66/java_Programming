package Arrays;
import java.util.Scanner;
public class Arrange_Numbers_Question {
	public static void main(String[] args) {
		
		
		int u = 1;
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int x=n-1;
	int arr [] = new int [n];
   for (int i = 0; i <=n/2 ; i++ ) {
	   
	   arr[i] =  u;
	   u= u+2;
		System.out.println(arr[i]);
   }
		

   for (int i = n/2+1 ; i<n ; i++) {
	   
	   
	   arr[i] = x;
	   x=x-2;
	   System.out.println(arr[i]);
   
  
}
}}