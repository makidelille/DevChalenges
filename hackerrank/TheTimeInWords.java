package hackerrank;

import java.util.Scanner;

public class TheTimeInWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		String s ="";
		if(m == 0){
			s = intToString(h) + " o' clock";
		}else if(m == 1){
			s = "one minute past " + intToString(h);
		}else if(m == 15){
			s = "quarter past " + intToString(h);
		}else if(m== 30){
			s = "half past " +intToString(h);
		}else if(m == 59){
			s = "one minute to " + intToString(h+1);
		}else if(m == 45){
			s = "quarter to " + intToString(h+1);
		}else if(m<30){
			s = intToString(m) + " minutes past " + intToString(h);
		}else if(m > 30){
			s = intToString(60 - m) + " minutes to " + intToString(h+1);
		}
		System.out.println(s);
		
				
	}
	
	public static String intToString(int i){
		switch(i){
		case 1: return "one";
		case 2 : return "two";
		case 3 : return "three";
		case 4 : return "four";
		case 5 : return "five";
		case 6 : return "six";
		case 7 : return "seven";
		case 8 : return "eight";
		case 9 :return "nine";
		case 10 : return "ten";
		case 11 : return "eleven";
		case 12 : return "twelve";
		case 13 :return "thirteen";
		case 14 : return "fourteen";
		case 15 : return "quarter";
		case 16 : return "sixteen";
		case 17 : return "seventeen";
		case 18 : return "eighteen";
		case 19 : return "nineteen";
		case 20 : return "twenty";
		case 30 : return "thirty";
		case 40 : return "fourty";
		case 50 : return "fifty";
		default : return intToString(10 * (i/10)) + " " + intToString(i%10);
		}
		
		
	}

}
