package hackerrank.implementation;

import java.util.Scanner;

public class SherlockAndTheBeast {

	public static void main(String[] args) {	
		//NOTE : system.out is broken :(
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder s = new StringBuilder();
		for (int a = 0; a < t; a++) {
			int n = sc.nextInt();
			int ans = -1;
			for (int i = 0; i <= n; i += 5) {
				if ((n - i) % 3 == 0) {
					ans = i;
					break;
				}
			}
			if (ans == -1)
				s.append("-1");
			else {
				for (int k = 0; k < (n-ans)/3; k++) {
					s.append("555");
				}
				for (int k = 0; k < ans/5; k++) {
					s.append("33333");
				}
			}
			s.append("\n");

		}
		System.out.println(s.toString());
	}
}
