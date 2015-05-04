package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		//logic
		List<Integer> l = new ArrayList<>();
		for(int j=0; j< n; j++){
			if(l.contains(a[j])){
				l.remove((Object)a[j]);
			}else{
				l.add(a[j]);
			}
		}
		Integer[] lbis =  l.toArray(new Integer[1]); //the casting....
		System.out.println(lbis[0]);
	}

}
