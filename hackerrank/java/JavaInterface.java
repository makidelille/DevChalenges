package hackerrank.java;

public class JavaInterface {

    public static void main(String[] args) {
	System.out.println(divisorSum(6));

    }

    public static int divisorSum(int n) {
	int sum =  n > 1 ? 1 +n : 1;
	for(int i = 2; i<= n/2; i++){
	    if(n % i == 0) sum += i;
	}
	return sum;
    }

}
