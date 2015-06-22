package hackerrank.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	List<BigDecimal>list = new ArrayList<>();
	BigDecimal[] sorted = new BigDecimal[n];
	for(int a=0; a<n; a++){
	    String s = sc.nextLine();
	    list.add(new BigDecimal(s));
	}
	//sort
	for(int a=0; a <n; a++){
	    BigDecimal max = list.get(0);
	    for(int j=0; j< n-a; j++){
		if(list.get(j).compareTo(max) > 0){
		    max = list.get(j);
		}
	    }
	    sorted[a] = max;
	    list.remove(max);
	}
	for(int i=0; i<n; i++)System.out.println(sorted[i].toPlainString().replaceAll("^0+.", "."));
    }

}
