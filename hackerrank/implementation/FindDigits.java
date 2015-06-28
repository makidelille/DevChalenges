package hackerrank.implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int a=0; a< t; a++){
			String s = sc.next();
			int n = Integer.valueOf(s);
			int r=0;
			for(int i=0; i < s.length(); i++){
				int digit = Integer.parseInt(Character.toString(s.charAt(i)));
				if(digit == 0) continue;
				if(n % digit == 0) r++;
			}
			System.out.println(r);
		}
	}

}
