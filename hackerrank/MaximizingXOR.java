package hackerrank;

import java.util.Scanner;

public class MaximizingXOR {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int max = 0;
		for (int a=l; a <= r; a++){
			for(int b=a; b<= r; b++)
				if((a^b) > max) max = b^a;
		}
		System.out.println(max);
	}
	
}
