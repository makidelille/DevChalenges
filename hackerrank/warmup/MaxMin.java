package hackerrank.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		for(int i=0;i< n; i++){
			l.add(sc.nextInt());
		}
		Collections.sort(l);
		int min = Integer.MAX_VALUE;
		for(int i=0; i< n-k; i++){
			int diff=l.get(i + k -1) - l.get(i);
			if(diff < min) min = diff;
		}
		System.out.println(min);
	}

}
