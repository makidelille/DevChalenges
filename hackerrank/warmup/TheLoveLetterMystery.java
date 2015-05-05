package hackerrank.warmup;

import java.util.Scanner;

public class TheLoveLetterMystery {

	// 'a' = 97

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		
		for (int a = 0; a < t; a++) {
			int operations = 0;
			String s = sc.next();
			int[] arr = new int[s.length()];
			for (int i = 0; i < s.length(); i++) {
				arr[i] = s.charAt(i);
			}
			// logic
			for (int j = 0; j < arr.length / 2; j++) {
				int first = arr[j];
				int last = arr[arr.length - j-1];
				int diff = Math.abs((first - last));
				operations += diff;
			}
			System.out.println(operations);

		}
	}

}
