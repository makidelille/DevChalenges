package hackerrank.strings;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int a=0; a < t; a++){
			String s = sc.next();
			int deletion = 0;
			char c = s.charAt(0);
			for(int i=1; i< s.length(); i++){
				if(s.charAt(i) == c) deletion++;
				else c = s.charAt(i);
			}
			System.out.println(deletion);
		}

	}

}
