package hackerrank;

import java.util.Scanner;

public class FillingJars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[m][3];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < 3; j++)
				arr[i][j] = sc.nextInt();
		
		long sum=0;
		for(int k=0; k< m; k++){
				sum += (long)arr[k][2] * (long)(arr[k][1] - arr[k][0]+1);
		}
		long r = sum/n;
		System.out.println(r);
		
	}

}
