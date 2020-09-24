package Searching_Sorting;

import java.util.Scanner;

public class Merge_two_Sorted_Arrays {

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
	
	public static int[] Merge(int[]arr1 , int[]arr2) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		int[] ans = new int[arr1.length + arr2.length];
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
				
			}else {
				ans[k] = arr2[j];
				j++;
				k++;				
			}
		}
		
		while(i<arr1.length) {
			ans[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			ans[k] = arr2[j];
			k++;
			j++;			
		}
	return ans;	
		
	}
	public static void main(String[] args) {
		int[] arr1 = takeinput1();
		int[] arr2 = takeinput2();
		int[] ans = Merge(arr1, arr2);
		for(int i = 0 ; i < ans.length ; i++) {
		System.out.print(ans[i] + " ");	
		}
		
		
	}	
}
