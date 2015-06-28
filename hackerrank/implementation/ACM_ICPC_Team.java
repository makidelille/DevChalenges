package hackerrank.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ACM_ICPC_Team {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i=0; i < n; i++){
			String line = sc.next();
			for(int j=0; j< m; j++)
				arr[i][j] = Integer.parseInt(Character.toString(line.charAt(j)));
		}
		//first task
		int max = 0;
		List<Integer> l = new ArrayList<>();
		for(int i=0; i <n; i++){
			int[] p1 = arr[i];
			for(int j=i+1; j< n; j++){
				int[] p2 = arr[j];
				int topic = 0;
				for(int k=0; k < m; k++) if((p1[k] | p2[k]) == 1) topic++;
				if(topic > max) max = topic;
				l.add((Integer)topic);
			}
		}
		System.out.println(max);
		System.out.println(Collections.frequency(l, (Integer)max));
		
	}

}
