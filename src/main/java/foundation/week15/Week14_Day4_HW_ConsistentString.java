package foundation.week15;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;


public class Week14_Day4_HW_ConsistentString {

	/* 
Leetcode link: https://leetcode.com/problems/count-the-number-of-consistent-strings/


	Input 			----->  String,String[]
	Output 			----->  int

    Data Set:
		 Positive: 	---> Input: "xyz",["xy","yz","zx","xyz","zyx"]		    Output =    5
		 Negative: 	---> Input: "xyz",["axy","gyz"]	                        Output =    0
		 Edge: 	    ---> Input: "x",["x"]		                            Output =    1
		 Edge: 	    ---> Input: "mnop",["pmno"]		                        Output =    1



	Pseudo Code: Brute Force using Set
	1. Get the Strings: allowed and words and initialise ctr=0
	2. Iterate through the words and add each word into the set
	3. Iterate through the set and check if all the characters exists in the allowed character
	4. If true, increment the ctr
	4. Return ctr the end


Best Solution :


Learning:


	 */

    @Test
    public void allTests() {



        Assert.assertEquals(2,getCount_ConsistentString_FreqArray("ab",new String[]{"ad","bd","aaab","baa","badab"}));
//        Assert.assertEquals(2,getCount_ConsistentString("ab",new String[]{"ad","bd","aaab","baa","badab"}));
//        Assert.assertEquals(5,getCount_ConsistentString("xyz",new String[]{"xy","yz","zx","xyz","zyx"}));
//        Assert.assertEquals(0,getCount_ConsistentString("xyz",new String[]{"axy","gyz"}));
//        Assert.assertEquals(1,getCount_ConsistentString("x",new String[]{"x"}));
//        Assert.assertEquals(1,getCount_ConsistentString("mnop",new String[]{"pmno"}));

        /*
        Positive: 	---> Input: "xyz",["xy","yz","zx","xyz","zyx"]		    Output =    5
		 Negative: 	---> Input: "xyz",["axy","gyz"]	                        Output =    0
		 Edge: 	    ---> Input: "x",["x"]		                            Output =    1
		 Edge: 	    ---> Input: "mnop",["pmno"]		                        Output =    1
		 */


    }

    public int getCount_ConsistentString(String allowed, String[] words) {
        int ctr = 0;
        boolean flag=true;

        HashSet<Character> setUnique=new HashSet<>();

        for (String eachWord:words) {

            System.out.println("Word: "+eachWord);
            for (int i = 0; i < eachWord.length(); i++) {setUnique.add(eachWord.charAt(i)); }

            flag=true;
            Iterator<Character> iterator = setUnique.iterator();
            while (iterator.hasNext()) {

                if(allowed.indexOf(iterator.next())<0) {
                    flag = false;
                    break;
                }
            }

            if(flag)ctr++;

            setUnique.clear();

        }


        return ctr;

    }

    public int getCount_ConsistentString_FreqArray(String allowed, String[] words) {
        int ctr = words.length;

        boolean[] arrASCII=new boolean[26];

        for (int i = 0; i < allowed.length(); i++) {
            arrASCII[allowed.charAt(i)-'a']=true;
        }

        for (String eachWord:words) {

            for(char eachChar:eachWord.toCharArray())
            {
                if(!arrASCII[eachChar-'a']) {
                    ctr--;
                    break;
                }
            }


        }


        return ctr;

    }



}

