package Assignment_1;


	import java.util.Scanner;
	public class spam {
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        scan.close();
	        int count=0;
	        int i=1;
	        while(i<=n+count){
	            int z = 3*i+2;
	            
	            if(z%4==0){
	                count++;
	                i++;
	                continue;}
	            System.out.print(z+" ");
	            
	            i++;
	           
	                
	            
	        }

		}
	}



