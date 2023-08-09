package foundation.week4;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;


/*
Pseudo Code:
1. Get the String and iterate through its length.. total=0
2. Get Each character at a time and find out its actual value in ASCII and convert to number 
	.. A--1, B-- 2
3. Track the total in total variable. Apply the formula with the power 26 
as we have total alphabets of 26
4. return total at the end

*/

public class ClassTest6_Anagram {
	public int titleToNumber(String columnTitle) {
        int total=0;
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            //total=total+columnTitle.charAt(i)-64;
            if(i==columnTitle.length()-1)
            {
                total=total+(columnTitle.charAt(i)-64);
            }
            else
            {
            total=total+((columnTitle.charAt(i)-64)*(getPowerOf26(columnTitle.length()-1-i)));
            }

        }
        return total;
    }

	int getPowerOf26(int num)
    {
        int resPower=1;

        while(num>0)
        {
            resPower=resPower*26;
            num=num-1;
        }


        return resPower;
    }
}



