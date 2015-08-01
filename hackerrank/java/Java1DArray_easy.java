package hackerrank.java;

import java.util.Scanner;

public class Java1DArray_easy {

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0; i< n; i++)
	    arr[i] = sc.nextInt();
	
	int result=0;
	for(int i=0; i< n; i++){
	    int sum = 0;
	    for(int j=i; j < n; j++){
		sum += arr[j];
		if(sum < 0){
		    result++;
		}
	    }
	}
	System.out.println(result);
    }
    
}
