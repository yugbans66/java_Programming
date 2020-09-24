package Strings_And_2D;
import java.util.Scanner;
public class Check_Permutation_Question {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		if (str1.length() == str2.length()) {
			for (int i = 0 ; i <str1.length() ; i++) {
				for (int j = 0 ; j<str2.length() ; j++) {
					if (str1.charAt(i) == str2.charAt(j)) {
						break;
					}else {
						System.out.println("False");
					}
					}
				
						
					
				}
			
			}
		}
	}


