package hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStringToken {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	List<String>list = new ArrayList<>();
	String temp = "";
	for(char c : s.toCharArray()){
	    if(c == ' ' || c == '_' || c == '!' || c == ',' || c == '?' || c == '.' ||
		    c == '\'' || c == '@'){
		if(!temp.equals("")) {
		    list.add(temp);
		    temp = "";
		}
	    }else{
		temp += c;
	    }
	}
	if(!temp.equals(""))list.add(temp);
	System.out.println(list.size());
	for (String st : list){
	    System.out.println(st);
	}
    }

}
