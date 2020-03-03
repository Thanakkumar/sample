package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleCode {
	
	public static void main(String Args[]) {
		
		System.out.println("sample");
		List<String> list = new ArrayList<>(Arrays.asList("hi","all"));
		List<String> list2 = new ArrayList<>(Arrays.asList("hi2","all"));
		list.retainAll(list2);
		System.out.println(list);
		List<Character> charList = new ArrayList<>();
		
		  for(char i='a';i<='z';i++){  
			  charList.add(i);  
	        } 
		  System.out.println(charList);
		
	}

}
