package hackerrank.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float n = sc.nextInt();
	int pos = 0, neg = 0, zer = 0;
	for (int i = 0; i < n; i++) {
	    int a = sc.nextInt();
	    if (a < 0)
		neg++;
	    else if (a > 0)
		pos++;
	    else zer++;
	}
	DecimalFormat form = new DecimalFormat("#.###");
	form.setMinimumFractionDigits(3);
	form.setMaximumFractionDigits(3);
	System.out.println(form.format(pos / n) + "\n" + form.format(neg / n)
		+ "\n" + form.format(zer / n));
    }

}
