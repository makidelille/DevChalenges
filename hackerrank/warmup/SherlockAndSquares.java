package hackerrank.warmup;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0; i< t; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ceilSqrtA = (int) Math.ceil(Math.sqrt(a));
			int floorSqrtB = (int) Math.floor(Math.sqrt(b));
			if(a!= b)System.out.println((int)Math.abs(floorSqrtB - ceilSqrtA +1));
			else if(a == b && ceilSqrtA == Math.sqrt(a)) System.out.println(1);
			else System.out.println(0);
		}
	}

}
