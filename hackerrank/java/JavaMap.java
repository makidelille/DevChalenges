package hackerrank.java;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashMap<String , String> phoneBook = new HashMap<>();
	int n = sc.nextInt();
	sc.nextLine();
	for(int a=0; a < n; a++){
	    phoneBook.put(sc.nextLine(), sc.nextLine());
	}
	while(sc.hasNext()){
	    String name = sc.nextLine();
	    if(phoneBook.containsKey(name)){
		System.out.println(name + "=" + phoneBook.get(name));
	    }else{
		System.out.println("Not found");
	    }
	}
    }

}
