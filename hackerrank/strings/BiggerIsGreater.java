package hackerrank.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BiggerIsGreater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a = 0; a < t; a++) {
			String s = sc.next();
			String re = "";
			List<Character> l = new ArrayList<>();
			for (char c : s.toCharArray())
				l.add(c);
			for (int i = s.length() - 2; i >= 0; i--) {
				String first = s.substring(0, i);
				String sub = s.substring(i, s.length());
				if (isPossible(sub)) {
					re = first
							+ smallestGreater(sub, sub.charAt(0))
							+ getSmallest(sub.replaceFirst(
									smallestGreater(sub, sub.charAt(0)), ""));

					if (!re.equals(s)) {
						break;
					}

				}
			}
			System.out
					.println(re.equals("") || re.equals(s) ? "no answer" : re);

		}
	}

	private static String smallestGreater(String sub, char close) {
		char re = sub.charAt(0);
		int min = Integer.MAX_VALUE;
		for (char c : sub.toCharArray())
			if (c > close && c - close < min) {
				min = c - close;
				re = c;
			}
		return Character.toString(re);
	}


	private static String getSmallest(String sub) {
		List<Character> l = new ArrayList<>();
		for (char c : sub.toCharArray())
			l.add(c);
		Collections.sort(l);
		String re = "";
		for (char c : l)
			re += c;
		return re;
	}

	private static boolean isPossible(String sub) {
		boolean p = false;
		char prev = sub.charAt(0);
		for (char c : sub.toCharArray()) {
			if (c > prev)
				if (!(p = true))
					break;
			prev = c;
		}
		return p;

	}

}