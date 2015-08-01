package hackerrank.java;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s1 = sc.next();
	int n1 = sc.nextInt();
	String s2 = sc.next();
	int n2 = sc.nextInt();
	String s3 = sc.next();
	int n3 = sc.nextInt();
	System.out.printf("================================\n"
		+ "%s %"+(15 - s1.length())+"s %03d\n"
		+ "%s %"+(15 - s2.length())+"s %03d\n"
		+ "%s %"+(15 - s3.length())+"s %03d\n"
		+ "================================", s1," ",n1,s2," ",n2,s3," ",n3);
    }
    
}
