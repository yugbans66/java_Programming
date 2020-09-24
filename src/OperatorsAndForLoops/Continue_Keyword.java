package OperatorsAndForLoops;

public class Continue_Keyword {
	public static void main(String[] args) {
		int i = 1;
		int n = 5;
		while (i <=n) {
			i++;
			if (i == 4) {
				continue ;
				
			}
			System.out.print(i +" ");
		}
	}

}

// Here, if we use this continue keyword in FOR LOOP then 
// the output will be diffrent because there i++ is bound to happen.
// like the output will be 1 2 3 5.
// If we use i++ after IF than this loop will go to infinity after 4.
// So, here the use of i++ is very important , it can cause errors because of its placement.
