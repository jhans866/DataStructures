package demo;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countnumofoccurance {
	public static long count(String s, char ch) 
    { 
  
        // Use Matcher class of java.util.regex 
        // to match the character 
        Matcher matcher 
            = Pattern.compile(String.valueOf(ch)) 
                  .matcher(s); 
  
        int res = 0; 
  
        // for every presence of character ch 
        // increment the counter res by 1 
        while (matcher.find()) { 
            res++; 
        } 
  
        return res; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Integer> s = new HashSet<Integer>();
		String str = "geeksforgeeks"; 
        char c = 'e'; 
        System.out.println(count(str, c));
		

	}

}
