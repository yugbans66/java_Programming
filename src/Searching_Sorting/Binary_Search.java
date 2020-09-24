package Searching_Sorting;

public class Binary_Search {
public static int binarysearch(int [] input , int elem) {
	int start = 0;
	int end = input.length - 1;
	while (start <= end) {
		int mid = (start + end )/2;
		if (elem == input[mid]) {
			return mid ;
		}else if (elem > input [mid]) {
			start = mid +1;
		}else {
			end = mid-1;
		}
		
	}	
	return -1;
}
public static void main(String[] args) {
	int [] input = {1,3,4,5,6,7};
	int index = binarysearch(input ,6 );
	System.out.println(index);
}
}
