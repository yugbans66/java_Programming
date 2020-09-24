package Functions;

public class Divide_numbers {
	public static int divideNumbers(int num, int deno) {
		if(deno == 0) {
			return Integer.MIN_VALUE;
		}
		//System.out.println("Insie division fraction");
		return num / deno;
	
	}
	public static void printdivisionResult(int num , int deno) {
		if (deno == 0) {
			//exit the function 
			System.out.println("Division by Zero is not allowed");
			return;
		}
		System.out.println(num/ deno);
		
	}
	public static void main(String[] args) {
		int num = 8;
		int deno = 4;
		// int result = divideNumbers(num, deno);
		//System.out.println(result);
		
	}
}
