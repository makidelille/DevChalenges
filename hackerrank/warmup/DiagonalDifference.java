package hackerrank.warmup;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int d1 =0,d2 = 0;
	for(int i=0;i< n; i++){
	    for(int j=0; j < n; j++){
		int a = sc.nextInt();
		if(i == j) d1 += a;
		if(i == n-j-1) d2 += a;
	    }
	}
	System.out.println((int)Math.abs(d2-d1));
    }

}
