package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmithNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nS = sc.next();
		int n = Integer.parseInt(nS);
		int sumDigit = 0;
		for (int i = 0; i < nS.length(); i++)
			sumDigit += Integer.parseInt(Character.toString(nS.charAt(i)));
		List<Integer> primeFactors = new ArrayList<>();
		int f = n;
		int x = 2;
		while (f > 1) {
			if (f % x == 0) {
				f = f / x;
				primeFactors.add(x);
			} else {
				x++;
			}
		}
		int sumFactor = 0;
		for (int j = 0; j < primeFactors.size(); j++) {
			String s = Integer.toString(primeFactors.get(j));
			for(int k=0; k< s.length(); k++)
				sumFactor += Integer.parseInt(Character.toString(s.charAt(k)));
		}
		System.out.println( sumFactor == sumDigit ? "1" : "0");

	}

}
