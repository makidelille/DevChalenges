package hackerrank.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a = 0; a < t; a++) {
			String s1 = sc.next();
			String s2 = sc.next();
			boolean ans = false;
			List<Character> l = new ArrayList<>();
			for (int i = 0; i < s1.length(); i++) {
				if(l.contains(s1.charAt(i))) continue;
				else l.add(s1.charAt(i));
				if(s2.contains(Character.toString(s1.charAt(i)))) if(ans = true) break;
			}
			System.out.println(ans ? "YES" : "NO");

		}

	}
}
