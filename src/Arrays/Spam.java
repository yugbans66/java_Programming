package Arrays;

public class Spam {
	public static void intersections(int[] input1, int[] input2){
		for(int i = 0; i < input1.length; i++) {
		for(int j = 0; j < input2.length; j++) {
		if(input1[i] == input2[j]) {
		System.out.println(input1[i]);
		input2[j] = Integer.MIN_VALUE;
		break;
		}
		}
		}
		}
}
