package hackerrank.warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(fact(sc.nextInt()));
    }
    
    public static BigInteger fact(int n){
	if(n == 1) return BigInteger.ONE;
	else return fact(n-1).multiply(new BigInteger(Integer.toString(n)));
    }

}
