package hackerrank.warmup;

import java.util.Scanner;

public class UtopianTree {

	// 1st cycle = Spring -> *2
	// 2nd cycle = Summer -> +1
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a=0; a < t; t++){
			int n = sc.nextInt();
			int h= 1;
			for (int b=1; b <= n; b++){
				if(b%2 ==0) h++;
				else h *=2;
			}
			
			System.out.println(h);
		}
		sc.close();
		
	}
	
}
