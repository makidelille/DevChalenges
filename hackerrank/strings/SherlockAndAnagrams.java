package hackerrank.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SherlockAndAnagrams {

    static List<AnagramPair> pairList;
    static String s;
    static int result;

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for (int a = 0; a < t; a++) {
	    s = sc.next();
	    result = 0;
	    List<Character> letters = new ArrayList<>();
	    pairList = new ArrayList<>();
	    for (char c : s.toCharArray()) {
		letters.add(c);
	    }
//	    for (char c = 'a'; c <= 'z'; c++)
//		if (Collections.frequency(letters, c) > 1) result++;
	    String cp = s;
	    for (int size = 1; size < cp.length(); size++) {
		// we generate all the possible substrings
		List<String> combinationofSize = new ArrayList<>();
		for (int startI = 0; startI < cp.length() - size + 1; startI++) {
//		    if (!combinationofSize.contains(cp.substring(startI, startI
//			    + size)))
			combinationofSize.add(cp.substring(startI, startI
				+ size));
		}
		// test here
		for (int i = 0; i < combinationofSize.size(); i++) {
		    for (int j = i + 1; j < combinationofSize.size(); j++) {
			if (areAnagrams(combinationofSize.get(i),
				combinationofSize.get(j))) {
			    AnagramPair pair = new AnagramPair(
				    combinationofSize.get(i),
				    combinationofSize.get(j));
			    if (!pairList.contains(pair)) {
				pairList.add(pair);
			    }
			}
		    }

		}
	    }

	    result += pairList.size();

	    System.out.println(result);

	}
    }

    public static class UniqueLetter {
	char letter;

	public UniqueLetter(char c) {
	    letter = c;
	}

	public void addAnagrams() {
	    int index = s.indexOf(letter);
	    // if(index == s.length() -1) return;
	    int maxSize = index <= s.length() / 2 ? index : s.length()
		    - (index + 1);
	    for (int i = 1; i < maxSize; i++) {
		String l = s.substring(index - i, index + 1);
		String r = s.substring(index, index + i + 1);
		if (areAnagrams(l, r)) {
		    AnagramPair pair = new AnagramPair(l, r);
		    if (!pairList.contains(pair)) {
			pairList.add(pair);
		    }
		}
	    }
	}

    }

    public static class AnagramPair {

	String s1;
	String s2;

	public AnagramPair(String p1, String p2) {
	    s1 = p1;
	    s2 = p2;
	}

	@Override
	public boolean equals(Object obj) {
	    return obj instanceof AnagramPair
		    && obj != null
		    && (s1.equals(((AnagramPair) obj).s1)
			    && s2.equals(((AnagramPair) obj).s2) || (s2
			    .equals(((AnagramPair) obj).s1) && s1
			    .equals(((AnagramPair) obj).s2)));
	}

    }

    public static boolean areAnagrams(String s1, String s2) {
	if (s1.equals(s2)) return true;
	List<Character> l1 = new ArrayList<>();
	List<Character> l2 = new ArrayList<>();
	for (char c : s1.toCharArray())
	    l1.add(c);
	for (char c : s2.toCharArray())
	    l2.add(c);
	Collections.sort(l1);
	Collections.sort(l2);
	return l1.equals(l2);
    }

}
