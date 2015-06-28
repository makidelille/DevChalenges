package hackerrank.implementation;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] widths = new int[n];
		for(int i=0; i<n; i++){
			widths[i] = sc.nextInt();
		}
		for(int a=0;a<t; a++){
			int i = sc.nextInt();
			int j = sc.nextInt();
			int min = 3;
			for(int b=i; b<= j; b++){
				if(widths[b] < min) min = widths[b];
			}
			System.out.println(min);
		}
	
	
	}
	
}
