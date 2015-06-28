package hackerrank.warmup;

import java.util.Scanner;

public class LibraryFine {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int dRe = sc.nextInt();
	int mRe = sc.nextInt();
	int yRe = sc.nextInt();
	int dEx = sc.nextInt();
	int mEx = sc.nextInt();
	int yEx = sc.nextInt();
	if (yRe > yEx) {
	    System.out.println(10000);
	} else if (mRe > mEx && yRe == yEx) {
	    System.out.println(500 * (mRe - mEx));
	} else if(dRe > dEx && mRe == mEx && yRe == yEx){
	    System.out.println(15 * (dRe - dEx));
	} else{
	    System.out.println(0);
	}

    }

}
