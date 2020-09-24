package Arrays;
import java.util.Scanner;
public class Find_Unique {
	  
	public static int[] takeinput(){
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		size = 2*size + 1;
	    int [] arr = new int [size];
	    for (int i = 0 ; i < size ; i++) {
	    	arr[i] = s.nextInt();
	    }
	    return arr;
		
	}
	public static void main(String[] args) {
		takeinput();
		for (int i = 0 ; i< size ; i++) {
			
		}
	}
}
