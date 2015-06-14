package hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStack {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(sc.hasNext()){
	    String s = sc.nextLine();
	    List<Character> stacks = new ArrayList<Character>();
	    boolean ans = true;
	    for(char c : s.toCharArray()){
		if(c == '(' || c == '[' || c == '{'){
		    stacks.add((Character)c);	//casting in java	    
		}else if(c == ')' || c == ']' || c == '}'){
		    int size = stacks.size() -1;
		    if(size == -1) {
			ans =false;
			break;
		    }
		    switch(stacks.get(size)){
		    case '(':
			if(c == ')') stacks.remove(size);
			break;
		    case '{':
			if(c == '}') stacks.remove(size);
			break;
		    case '[':
			if(c == ']') stacks.remove(size);
			break;
		    }
		    if(size == stacks.size()-1){
			ans = false;
		    }
		}else{
		    ans = false;
		}
		//check if need to break
		if(!ans)break;
	    }
	    if(!stacks.isEmpty()) ans =false;
	    System.out.println(ans);
	    
	    
	}

    }

}
