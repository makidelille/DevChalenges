package hackerrank;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a = 0; a < t; a++) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int m = sc.nextInt();

			int count = 0;
			while (n >= c) {
				count++;
				n -= c;
				if (count % m == 0)
					count++;
			}
			System.out.println(count);

		}
	}

}
