package hackerrank.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for (int a = 0; a < t; a++) {
	    String s = sc.next();
	    int result = 0;
	    List<Character> l = new ArrayList<>();
	    for (char c : s.toCharArray()) {
		l.add(c);
	    }
	    for(char c='a'; c<='z'; c++)
		if(Collections.frequency(l, c) > 1) result++;
	    
	    
	    
	    System.out.println(result);

	}
    }
}
