package hackerrank.strings;

import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase().replaceAll(" ", "");
		boolean isPangrams = true;
		for (char c = 'a'; c <= 'z'; c++) {
			boolean found = false;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == c) {
					found = true;
					break;
				}
			}
			if (!found)
				if (!(isPangrams = false))
					break;
		}
		System.out.println(isPangrams ? "pangram" : "not pangram");
	}

}
