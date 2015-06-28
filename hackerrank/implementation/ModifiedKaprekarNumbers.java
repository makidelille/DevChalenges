package hackerrank.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=p; i<= q; i++){
			long iSq = (long)i * (long)i;
			int idigit = Integer.toString(i).length();
			String s = "0" + Long.toString(iSq);
			String ls = "0" + s.substring(0, s.length() - idigit);
			String rs = "0" + s.substring(s.length() - idigit);
			int l = Integer.parseInt(ls);
			int r = Integer.parseInt(rs);
			

			if(l  + r == i) list.add(i);
		}
		if(list.isEmpty()) System.out.println("INVALID RANGE");
		else{
			for(Integer in : list) System.out.print(in + " ");
		}
		
	}

}
