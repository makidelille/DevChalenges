package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsFibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long[] n = new long[t];
		long max = Long.MIN_VALUE;
		for(int i=0; i< t ; i++){
			n[i] = sc.nextLong();
			if(n[i] > max) max = n[i];
		}
		List<Long> fibo = new ArrayList<>();
		fibo.add(0L);
		fibo.add(1L);
		long fEven = 0;
		long fOdd = 1;
		while(fEven < max && fOdd < max){
			fEven += fOdd;
			fOdd += fEven;
			fibo.add(fEven);
			fibo.add(fOdd);
		}
		for(int i=0; i< t; i++){
			System.out.println(fibo.contains((long)n[i]) ? "IsFibo" : "IsNotFibo");
		}
	}

}
