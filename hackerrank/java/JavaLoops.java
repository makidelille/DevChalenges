package hackerrank.java;

import java.util.Scanner;

public class JavaLoops {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for(int i=0; i< t; i++){
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int n = sc.nextInt();
	    int s = a + b; 
	    for(int j=1; j<= n; j++){
		System.out.print(s + " ");
		s += Math.pow(2, j) * b;
	    }
	    System.out.print("\n");
	}
    }

}
