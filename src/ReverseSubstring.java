/**
 * @(#)ReverseSubstring.java
 *
 * ReverseSubstring application
 *
 * @author 
 * @version 1.00 2010/10/9
 */
 import java.io.*;
public class ReverseSubstring {
    //Checks for palindrome
    public static boolean reverseThis(String aStr){
    	int i =0;
    	int j = aStr.length()-1;
    	while(i<=j){
    		if(aStr.charAt(i) != aStr.charAt(j)){
    			return false;
    		}
    		i++;
    		j--;
    	}
    	return true;
    }
    
    public static void main(String[] args) {
    	
    	String longest =""; //Stores the longest palindrome
    	try{
    	//Reads in string
    	BufferedReader in = new BufferedReader(new FileReader("C:\\greplin.txt"));
    	String input = in.readLine();
    	
    	//Computes the longest palindrome
    	for(int i = 0;  i<input.length()-1; i++){
    		for(int j =i+1; j<input.length(); j++){
    			
    			if(input.charAt(i) == input.charAt(j)){    			   
    			   String aString = input.substring(i,j+1);
    			   boolean reverse = reverseThis(aString);
   			       if(reverse){
    			   	  if(aString.length() > longest.length()){
    					longest = aString; 					
    					
    				  }
    			   }
    			}
    		}
    	}
    	System.out.println("The answer to problem one is: "+ longest);
    	}catch(IOException ex){
    		System.out.println("Input Error: Abort");
    		System.exit(1);
    	}
    }
}
