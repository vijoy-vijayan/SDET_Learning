package week4.day1;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;


/*
Pseudo Code:

Pseduo code:
1. Get the String and iterate through its length.. total=0
2. Get Each character at a time and find out its actual value in ASCII 
3. Track the total in total variable
4. Add the condition to handle multiple characters at the end
4. return total at the end

*/

public class ClassTest4_TotalMatches {
	 public int titleToNumber(String columnTitle) {
	        int total=0;
	        for(int i=0;i<columnTitle.length();i++)
	        {
	            total=total+columnTitle.charAt(i)-64;

	            if(i!=columnTitle.length()-1)
	                total=total+((columnTitle.charAt(i)-64)*25);
	        }
	        return total;
	    }
}



