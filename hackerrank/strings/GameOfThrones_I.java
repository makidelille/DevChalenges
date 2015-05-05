package hackerrank.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameOfThrones_I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Map<Character,Integer> charCount = new HashMap<>();
		for(int i=0; i< s.length(); i++){
			char c = s.charAt(i);
			if(charCount.containsKey((Character)c)){
				charCount.put((Character)c,++charCount.get((Character)c));
			}else{
				charCount.put((Character)c, 1);
			}
		}
		boolean hasAnOdd = false;
		boolean ans = true;
		for(Integer value : charCount.values()){
			if(value % 2 == 1) {
				if(!hasAnOdd) hasAnOdd = true;
				else{
					ans = false;
					break;
				}
			}
		}
		System.out.println(ans ? "YES" : "NO");
	}

}
