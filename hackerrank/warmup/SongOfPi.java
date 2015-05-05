package hackerrank.warmup;

import java.util.Scanner;

public class SongOfPi {

	public static void main(String[] args) {
		final String PI = "31415926535897932384626433833";
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int a=0; a < t; a++){
			String s = sc.nextLine();
			String[] split = s.split(" ");
			StringBuilder buil = new StringBuilder();
			for(int i=0; i< split.length;i++){
				 buil.append(split[i].replaceAll(" ", "").length());
			}
			System.out.println(PI.startsWith(buil.toString()) ? "It's a pi song." : "It's not a pi song.");
		}
	}

}
