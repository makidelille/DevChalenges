package hackerrank.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	int h = Integer.parseInt(st.substring(0, 2));
	int m = Integer.parseInt(st.substring(3, 5));
	int s = Integer.parseInt(st.substring(6, 8));
	boolean am = st.endsWith("AM");
	DecimalFormat df = new DecimalFormat("##");
	df.setMinimumIntegerDigits(2);
	if(h == 12 && am ) System.out.print("00");
	else if(h == 12 && !am ) System.out.print("12");
	else System.out.print(am ? df.format(h) : df.format((h +12) % 24));
	System.out.print( ":" + df.format(m) + ":" + df.format(s));
	
    }

}
