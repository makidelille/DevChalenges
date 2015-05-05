package hackerrank.strings;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a = 0; a < t; a++) {
			String fullS = sc.next();
			if (fullS.length() % 2 == 1) {
				System.out.println("-1");
				continue;
			}
			String s1 = fullS.substring(0, fullS.length() / 2);
			String s2 = fullS.substring(fullS.length() / 2, fullS.length());
			int modification = 0;
			for (int i = 0; i < s1.length(); i++) {
				char c = s1.charAt(i);
				boolean found = false;
				for (int j = 0; j < s2.length(); j++) {
					if (s2.charAt(j) == c) {
						s2 = s2.replaceFirst(Character.toString(c), "");
						found = true;
						break;
					}
				}
				if (!found)
					modification++;

			}
			System.out.println(modification);
		}

	}

}
