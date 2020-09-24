package OperatorsAndForLoops;

public class Break_Keyword {
	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		while (i<= 5) {
			if (i ==4) {
				break;
			}
			System.out.println(i);
			i++;
		}
		for (int j=1 ; j<=5 ; j++ ) {
			if (j == 4) {
				break;
			}
			System.out.println(j
					);
		}
		System.out.println("Outside While Loop");
	}

}
