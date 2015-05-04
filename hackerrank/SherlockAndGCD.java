package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockAndGCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a = 0; a < t; a++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			List<Integer> numbers = new ArrayList<>();
			int max = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if (!numbers.contains((Integer) arr[i]))
					numbers.add((Integer) arr[i]);
				if (arr[i] > max)
					max = arr[i];
			}

			// logic
			boolean exist = false;
			if (numbers.contains(1))
				exist = true;
			if (!exist)
				// we just need to find two numbers :
				// - that don't have any common factors => they can't be equal

				for (Integer n1 : numbers) {
					for (Integer n2 : numbers) {
						List<Integer> gcd = new ArrayList<>();
						for (int x = 2; x <= Math.min(n1, n2); x++)
							if (n1 % x == 0 && n2 % x == 0) {
								gcd.add((Integer)x);
							}
						if(gcd.isEmpty()) if(exist = true) break;
					}
					if (exist)
						break;

				}
			System.out.println(exist ? "YES" : "NO");
		}
	}

}
