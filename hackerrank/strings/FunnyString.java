package hackerrank.strings;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a = 0; a < t; a++) {
			String s = sc.next();
			String r = "";
			for (int j = s.length() - 1; j >= 0; j--) {
				r += Character.toString(s.charAt(j));
			}
			// we've got reverse string
			boolean isFunny = true;
			for (int i = 1; i < s.length(); i++) {
				if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != Math.abs(r
						.charAt(i) - r.charAt(i - 1))) {
					isFunny = false;
					break;
				}
			}
			System.out.println(isFunny ? "Funny" : "Not Funny");

		}

	}

}
