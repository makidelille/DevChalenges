package hackerrank.warmup;

import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	long sum = 0;
	int sign = 0;
	for (int i = 0; i < n; i++) {
	    String s = sc.next();
	    sum += Integer.parseInt(s.substring(1, s.length()));
	    sign += s.charAt(0) == 0 ? 0 : 1;
	}
	System.out.print(sign);
	String sumS = Long.toString(sum);
	for(int i=sumS.length() + 1; i < 10; i++){
	    System.out.print("0");
	}
	System.out.println(sumS);
    }

}
