package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			List<Integer> r = new ArrayList<>();
			int min = a > b ? b : a;
			int max = a > b ? a : b;
			if (max != min)
				for (int j = 0; j < n; j++) {
					r.add((max * j + (n - j - 1) * min));
				}
			else
				r.add((n - 1) * a);
			for (int ans : r) {
				System.out.print(ans + " ");
			}
			System.out.print("\n");

		}
	}
}
