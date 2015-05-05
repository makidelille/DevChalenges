package hackerrank.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GemStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] sArr = new String[n];
		List<Character> lCommonCharacters = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sArr[i] = sc.next();
			List<Character> temp = new ArrayList<>();
			if (i == 0)	{
				for (int j = 0; j < sArr[i].length(); j++) 
					if(!lCommonCharacters.contains((Character) sArr[i].charAt(j)))	
						lCommonCharacters.add((Character) sArr[i].charAt(j));
				continue;
			}
			else {
				for (int k = 0; k < sArr[i].length(); k++) 
					if(!temp.contains((Character) sArr[i].charAt(k)))	
						temp.add((Character) sArr[i].charAt(k));
			}
			lCommonCharacters.retainAll(temp);
				

		}
		System.out.println(lCommonCharacters.size());

	}

}
