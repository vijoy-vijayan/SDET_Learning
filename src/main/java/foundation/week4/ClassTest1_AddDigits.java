package foundation.week4;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

public class ClassTest1_AddDigits {
	
	class Solution {
	    public int addDigits(int num) {

	        if(num<=9)
	            return num;

	        int total=0, rem;

	        while(num>0)
	        {
	            rem=num%10;
	            total=total+rem;
	            num=num/10;

	            if(num==0 && total>9)
	            {
	                    num=total;
	                    total=0;
	            }
	        }

	        return total;
	        
	    }
	}

	/*
	Pseudo code:

	1. Get th input and iterate through the while loop with the condition of num>9
	2. Start adding the total by reducing the number back to single digit... num=num/10... total=total+rem
	3. Add the condition for checking res when Q=0 .. Make the total to 0 and continue
	4. return final result



	*/

}

