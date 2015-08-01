package hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java1DArray_hard {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for (int a = 0; a < t; a++) {
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int[] arr = new int[n];
	    for (int i=0; i < arr.length; i++)
		arr[i] = sc.nextInt();
	    List<Integer> reachablePos = new ArrayList<>();
	    reachablePos.add(0);
	    boolean win = false;
	    int size = 0;
	    // do the logic
	    while (size != reachablePos.size() && !win) {
		int prevSize =size;
		size = reachablePos.size();
		for (int k=prevSize;k < size; k++) {
		    int pos = reachablePos.get(k);
		    if (pos + 1 < n) {
			if (arr[pos + 1] == 0)
			    if (!reachablePos.contains(pos + 1))
				reachablePos.add(pos + 1);

		    } else {
			win = true;
		    }
		    if (pos > 2)
			if (arr[pos - 1] == 0)
			    if (!reachablePos.contains(pos - 1))
				reachablePos.add(pos - 1);
		    if (pos + m < n) {
			if (arr[pos + m] == 0)
			    if (!reachablePos.contains(pos + m))
				reachablePos.add(pos + m);
		    } else {
			win = true;
		    }
		    if(win)break;
		}
	    }
	    System.out.println(win ? "YES" : "NO");

	}
    }

}
