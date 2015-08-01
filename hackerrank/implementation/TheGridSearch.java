package hackerrank.implementation;

import java.util.Scanner;

public class TheGridSearch {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for (int a = 0; a < t; a++) {
	    int R = sc.nextInt();
	    int C = sc.nextInt();
	    String[] grid = new String[R];
	    for (int i = 0; i < R; i++)
		grid[i] = sc.next();

	    int r = sc.nextInt();
	    int c = sc.nextInt();
	    String[] pattern = new String[r];
	    for (int i = 0; i < r; i++)
		pattern[i] = sc.next();

	    boolean found = false;
	    for (int i = 0; i < R - r + 1; i++) {
		for (int j = 0; j < C - c + 1; j++) {
		    if (matches(i, j, grid, pattern)) {
			found = true;
			break;
		    }
		}
		if (found) break;
	    }
	    System.out.println(found ? "YES" : "NO");

	}

    }

    public static boolean matches(int i, int j, String[] grid, String[] pattern) {

	for (int a = i; a < i + pattern.length; a++) {
	    if (!pattern[a - i].equals(grid[a].substring(j,
		    j + pattern[0].length())))

	    return false;

	}
	return true;
    }
}
