package hackerrank.java;

import java.util.Scanner;

public class JavaDatatypes {

    public static final String[] types = {
	"* byte","* short","* int","* long"
    };
    
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	sc.nextLine();
	for(int i=0; i< t;i++){
		String s = sc.nextLine();
		int a=-1;
		try{
		    Long.parseLong(s); //if it can't we catch the exception
		    a = 3;
		    Integer.parseInt(s); //if it can't we catch the exception
		    a = 2;
		    Short.parseShort(s); //if it can't we catch the exception
		    a = 1;
		    Byte.parseByte(s); //if it can't we catch the exception
		    a = 0;
		}catch(NumberFormatException e){}
		if(a == -1){
		    System.out.println(s + " can't be fitted anywhere.");
		}else{
		    System.out.println(s + " can be fitted in:");
		    for(int j=a; j< types.length; j++){
			System.out.println(types[j]);
		    }
		}
	}
    }
}
