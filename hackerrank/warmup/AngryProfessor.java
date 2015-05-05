package hackerrank.warmup;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		for(int a = 0; a < t; a++){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			int missing = 0;
			for (int i=0; i< n; i++){
				arr[i] = sc.nextInt();
				if(arr[i] > 0) 
					missing++;
			}
			System.out.println(n- missing < k ? "YES" : "NO");
		}
	}

}
