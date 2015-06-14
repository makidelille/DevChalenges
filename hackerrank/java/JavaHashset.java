package hackerrank.java;

import java.util.Scanner;

public class JavaHashset {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	sc.nextLine();
	String ans = "";
	String[] arr = new String[t];
	int i=0;
	for (int a = 0; a < t; a++) {
	    String s = sc.nextLine();
	    arr[a] = s;
	    boolean c = false;
	    for (int j=0; j < a; j++) {
		if (arr[j].equals(s)) {
		    c=  true;
		    break;
		}
	    }if(!c)i++;
	    ans += i + "\n";
	}
	System.out.print(ans);
    }

}
