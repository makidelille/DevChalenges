package hackerrank.implementation;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int maxRoot = (int) Math.ceil(Math.sqrt(s.length()));
	int minRoot = (int) Math.floor(Math.sqrt(s.length()));
	int col = 0, row = 0;
	boolean found = false;
	for (row = minRoot; row <= maxRoot; row++) {
	    for (col = minRoot; col <= maxRoot; col++) {
		if (row * col >= s.length()) found = true;
		if (found) break;
	    }
	    if (found) break;
	}
	String[] arr = new String[row];
	for (int i = 0; i < arr.length; i++) {
	    arr[i] = s.substring(i * col,
		    (i + 1) * col > s.length() ? s.length() : (i + 1) * col);
	}
	//the printing to the screen
	for (int i = 0; i < col; i++) {
	    for(int j=0; j < arr.length; j++){
		if(i < arr[j].length()) System.out.print(arr[j].charAt(i));
	    }
	    System.out.print(" ");
	}

    }
}
