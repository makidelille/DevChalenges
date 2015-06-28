package hackerrank.warmup;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n = sc.nextInt();
	for(int i=0; i< n; i++){
	    for(int j=i+1; j < n; j++){
		System.out.print(" ");
	    }
	    for(int j=n-i-1; j <n; j++){
		System.out.print("#");
	    }
	    System.out.print("\n");
	}
    }

}
