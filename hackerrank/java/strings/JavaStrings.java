package hackerrank.java.strings;

import java.util.Scanner;

public class JavaStrings {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int k = sc.nextInt();
	String min = s.substring(0, k);
	String max = min;
	for (int i = 1; i < s.length() - k + 1; i++) {
	    String temp = s.substring(i, i + k);
	    for (int j = 0; j < k; j++) {
		if (temp.charAt(j) < min.charAt(j)) {
		    min = temp;
		} else if (temp.charAt(j) == min.charAt(j)) {
		    continue;
		}
		break;
	    }
	    for (int j = 0; j < k; j++) {
		if (temp.charAt(j) > max.charAt(j)) {
		    max = temp;
		} else if (temp.charAt(j) == max.charAt(j)) {
		    continue;
		}
		break;
	    }

	}
	System.out.println(min);
	System.out.println(max);
    }
}
