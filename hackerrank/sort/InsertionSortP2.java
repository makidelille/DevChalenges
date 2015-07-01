package hackerrank.sort;

import java.util.Scanner;

public class InsertionSortP2 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	int[] arr = new int[s];
	for (int i = 0; i < s; i++)
	    arr[i] = sc.nextInt();
	int k=1;
//	for (int k = 1; k < s; k++) {
	    int toSort = arr[k];
	    int index;
	    for (int j = s - 2; j >= k; j--) {
		boolean found = true;
		if (toSort < arr[j]) {
//		    arr[j + 1] = arr[j];
		    found = false;
		} else {
//		    arr[j + 1] = toSort;
		    index = j;
		}
		if (found) break;
		if (!found && j == k) arr[k] = toSort;
//	    }
	    for(int l=0; l < s; l++) System.out.print(arr[l] + " ");
	    System.out.print("\n");
	}

    }

}
