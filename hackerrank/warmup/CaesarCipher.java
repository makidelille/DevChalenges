package hackerrank.warmup;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	char[] string = sc.nextLine().toCharArray();
	int k = sc.nextInt();
	String res = "";
	for (char c : string) {
	    if (c >= 'a' && c <= 'z') {
		res += Character.toString((char) ((((c - 97) + k) % 26) + 97));
	    } else if (c >= 'A' && c <= 'Z') {
		res += Character.toString((char) ((((c - 65) + k) % 26) + 65));
	    } else {
		res += c;
	    }
	}
	System.out.println(res);

    }

}
