package Strings_And_2D;

public class Count_Words {

	public static int Countwords(String str) {
		int count = 1;
		for (int i = 0 ; i<str.length() ; i++) {
		if (str.charAt(i) == ' ')
			count++;
			
		}
		return count;
	}
	public static void main(String[] args) {
		String str = "This is a Sample String";
		Countwords(str);
		System.out.println(count);
	}
}
