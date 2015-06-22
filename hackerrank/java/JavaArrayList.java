package hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	List<List<Integer>> line = new ArrayList<>();
	for(int i=0; i< n; i++){
	    int d = sc.nextInt();
	    List<Integer> col = new ArrayList<>();
	    for(int j=0;j<d; j++){
		col.add(sc.nextInt());
	    }
	    line.add(col);
	}
	int q = sc.nextInt();
	for(int i=0; i< q; i++){
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    if( x > line.size()){
		System.out.println("ERROR!");
		continue;
	    }
	    List<Integer> l = line.get(x -1);
	    if( y > l.size()){
		System.out.println("ERROR!");
		continue;
	    }else{
		System.out.println(l.get(y-1));
	    }
	}
    }

}
