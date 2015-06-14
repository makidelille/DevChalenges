package hackerrank.java;

import java.util.Scanner;

public class Java2DArray {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[][] arr = new int[6][6];
	for (int i = 0; i < 6; i++) {
	    for (int j = 0; j < 6; j++) {
		arr[i][j] = sc.nextInt();
	    }
	}
	// do the logic
	int max = Integer.MIN_VALUE;
	for (int i = 0; i < 4; i++) {
	    for (int j = 0; j < 4; j++) {
		int sum = arr[i + 1][j + 1];
		for (int a = j; a < j + 3; a++)
		    sum += arr[i][a] + arr[i+2][a];
		if (sum > max) max = sum;
	    }
	}
	System.out.println(max);
    }

}
