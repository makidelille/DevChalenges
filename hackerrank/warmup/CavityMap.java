package hackerrank.warmup;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i < n; i++){
			String line = sc.next();
			for(int j=0; j< n; j++)
				arr[i][j] = Integer.parseInt(Character.toString(line.charAt(j)));
		}
		for(int i=1; i < n -1; i++)
			for(int j=1; j< n -1; j++)
				if(arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i +1][j]
						&& arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i][j+1])
					arr[i][j] = 10;
		
		for(int i=0; i < n; i++){
			for(int j=0; j< n; j++)
				System.out.print(arr[i][j] == 10 ? "X" : Integer.toString(arr[i][j]));
			System.out.print("\n");
		}			
					
		
		
	}

}
