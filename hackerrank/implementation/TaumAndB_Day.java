package hackerrank.implementation;

import java.util.Scanner;

public class TaumAndB_Day {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int a=0; a < t; a++){
			int b = sc.nextInt();
			int w = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int sum = 0;
			int priceB = x;
			int priceW = y;
			if(x > y + z){ // we buy white and convert to black
				priceB = y+z;
			}else if(y > x + z){ //we buy black and convert to white
				priceW = x+z;
			}
			System.out.println((long)priceB * b + (long)priceW * w);
		}
	}

}
