package hackerrank.sort;

import java.util.Scanner;

public class InsertionSortP1 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	int[] arr = new int[s];
	for(int i=0; i< s; i++) arr[i] = sc.nextInt();
	//sorts 1 element
	int toSort = arr[s-1];
	for(int j = s-2; j >= 0 ; j--){
	    boolean found = true;
	    if(toSort < arr[j]){
		arr[j+1] = arr[j];
		found = false;
	    }else{
		arr[j+1] = toSort;
	    } 
	    for(int k=0; k < s; k++) System.out.print(arr[k] + " ");
	    System.out.print("\n");
	    if(found) break;
	    if(!found && j==0) arr[0] = toSort;
	}
    }

}
