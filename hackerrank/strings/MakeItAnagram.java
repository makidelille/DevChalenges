package hackerrank.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeItAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		Map<Character,Integer> charCount1 = new HashMap<>();
		for(int i=0; i< s1.length(); i++){
			char c = s1.charAt(i);
			if(charCount1.containsKey((Character)c)){
				charCount1.put((Character)c,charCount1.get((Character)c)+1);
			}else{
				charCount1.put((Character)c, 1);
			}
		}
		
		Map<Character,Integer> charCount2 = new HashMap<>();
		for(int i=0; i< s2.length(); i++){
			char c = s2.charAt(i);
			if(charCount2.containsKey((Character)c)){
				charCount2.put((Character)c,charCount2.get((Character)c)+1);
			}else{
				charCount2.put((Character)c, 1);
			}
		}
		int deletions = 0;
		for(Character key : charCount1.keySet()){
			if(!charCount2.containsKey(key)){
				deletions += charCount1.get(key);
			}else{
				int v1 = charCount1.get(key);
				int v2 = charCount2.get(key);
				deletions += Math.abs(v2-v1);
				charCount2.put(key, v1);
			}
		}
		for(Character key : charCount2.keySet()){
			if(!charCount1.containsKey(key)){
				deletions += charCount2.get(key);
			}
		}
		System.out.println(deletions);
		
		
	}

}
