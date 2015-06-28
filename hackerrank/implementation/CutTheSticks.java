package hackerrank.implementation;

import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i < n ; i++){
			a[i] = sc.nextInt();
		}
		//logic
		int nbofStickleft = n;
		int[] cp = a.clone();
		while(nbofStickleft > 0){
			int operations = 0;
			int[] c = new int[nbofStickleft];
			int k=0;
			for(int j=0; j< cp.length; j++){
				if(cp[j] != 0) {
					c[k] = cp[j];
					k++;
				}
			}
			int min = min(c);
			k=0;
			for(int j=0; j< c.length; j++){
				c[j] -= min;
				operations++;
				if(c[j] > 0) k++;
			}
			nbofStickleft = k;
			cp = c.clone(); 
			System.out.println(operations);
		}
	
		
	}
	
	public static int min(int[] a){
		int min = Integer.MAX_VALUE;
		for(int i : a){
			if(i < min) min = i;
		}
		return min;
	}
	
}
