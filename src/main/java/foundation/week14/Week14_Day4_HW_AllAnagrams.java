package foundation.week14;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Week14_Day4_HW_AllAnagrams {

	/* 
Leetcode link: https://leetcode.com/problems/find-all-anagrams-in-a-string/description/


	Input 			----->  String, String
	Output 			----->  int[]

	Data Set:
		 Positive: 	---> Input: "abcabc","abc"			    Output =  [0,1,2,3]
		 Positive: 	---> Input: "aatestt" ,"test"           Output =   [2,3]
		 Negative: 	---> Input: "abcdef","xyz"              Output =  []
		 Edge: 	    ---> Input: "silent","listen"		    Output=   [0]
		 Edge: 	    ---> Input: "a","a"		                Output=   [0]

    Algorithm: Sliding Window - Static

	Pseudo code:
    1. Get the input strings s and p.. Initialise the ptr as 0 and the window size as p.length(), SB1 for Substring
    2. Iterate through the window size initially to form the new string from S with window size
    3. Iterate again in loop from window size to s length - k
    4. Check for the anagram logic and add the result in new SB
    5. Update the substring by adding character at end and removing from beginning
    6. Check for Anagram logic after the loop once and add the result in new SB
    7. Convert the result SB to int[] and return

	 */

    @Test
    public void allTests() {

        List<Integer> expected= Arrays.asList(0,1,2,3);
//        Assert.assertEquals(expected, findAnagrams("abcabc","abc"));
        Assert.assertEquals(expected, findAnagrams_MyFinalSolution("abcabc","abc"));

       /* expected= Arrays.asList(2,3);
        Assert.assertEquals(expected, findAnagrams("aatestt" ,"test"));
        expected= Arrays.asList();
        Assert.assertEquals(expected, findAnagrams("abcdef","xyz"));
        expected= Arrays.asList();
        Assert.assertEquals(expected, findAnagrams("abcdef","aaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        expected= Arrays.asList(0);
        Assert.assertEquals(expected, findAnagrams("silent","listen"));
        expected= Arrays.asList(0);
        Assert.assertEquals(expected, findAnagrams("a","a"	));
*/


    }

    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> result=new ArrayList<Integer>();

        if(p.length()>s.length())
            return result;

        int left=0,ptr=0,k=p.length();

        StringBuilder subArray=new StringBuilder();//"abcabc","abc"

        while(ptr<k)
            subArray.append(s.charAt(ptr++));

        while(left<s.length()-k)//abc    o(s.length()-k * (n log n))
        {

           System.out.println(subArray.toString());

           if(isAnagram(subArray.toString(),p))
               result.add(ptr-k);

            subArray.deleteCharAt(0);
            subArray.append(s.charAt(ptr++));
            left++;

        }

        if(isAnagram(subArray.toString(),p))
            result.add(ptr-k);



        return result;

    }
    public boolean isAnagram(String original,String newString)
    {
        char[] arrOriginal = original.toCharArray();
        char[] arrNewString=newString.toCharArray();

        Arrays.sort(arrOriginal);
        Arrays.sort(arrNewString);

//        for(int i=0;i<original.length();i++)
//            if(arrOriginal[i]!=arrNewString[i])return false;


        return Arrays.equals(arrOriginal, arrNewString);
    }

    public List<Integer> findAnagrams_MyOptimizedSolution(String s, String p) {

        ArrayList<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] pCharCount = new int[26];
        int[] sCharCount = new int[26];

        for (char c : p.toCharArray()) {
            pCharCount[c - 'a']++;
        }

        for (int i = 0; i < p.length(); i++) {
            sCharCount[s.charAt(i) - 'a']++;
        }

        for (int i = p.length(); i < s.length(); i++) {
            if (Arrays.equals(pCharCount, sCharCount)) {
                result.add(i - p.length());
            }

            sCharCount[s.charAt(i) - 'a']++;
            sCharCount[s.charAt(i - p.length()) - 'a']--;
        }

        if (Arrays.equals(pCharCount, sCharCount)) {
            result.add(s.length() - p.length());
        }

        return result;

    }

    public List<Integer> findAnagrams_BestSolution(String s, String p) {//https://leetcode.com/problems/find-all-anagrams-in-a-string/solutions/792028/simple-sliding-window-java-solution-o-n-6ms-90-beat/

        int freq1[] = new int[26];
        int freq2[] = new int[26];
        List<Integer> list = new ArrayList<>();

        if(s.length()<p.length())
            return list;

        for(int i=0; i<p.length(); i++){
            freq1[s.charAt(i)-'a']++;
            freq2[p.charAt(i)-'a']++;
        }

        int start=0;
        int end=p.length();

        if(Arrays.equals(freq1,freq2))
            list.add(start);

        while(end<s.length()){

            freq1[s.charAt(start)-'a']--;
            freq1[s.charAt(end)-'a']++;

            if(Arrays.equals(freq1,freq2))
                list.add(start+1);

            start++;
            end++;
        }
        return list;

    }

    public List<Integer> findAnagrams_MyFinalSolution(String s, String p) {

        ArrayList<Integer> result=new ArrayList<Integer>();

        if(p.length()>s.length())
            return result;

        int left=0,right=0;

        int[] pCharTracker=new int[26];
        int[] sCharTracker=new int[26];



        while(right<p.length())
        {
            pCharTracker[p.charAt(right)-'a']++;
            sCharTracker[s.charAt(right++)-'a']++;
        }
        if(Arrays.equals(pCharTracker,sCharTracker))
            result.add(left);

        while(right<s.length())
        {
            sCharTracker[s.charAt(left++)-'a']--;
            sCharTracker[s.charAt(right++)-'a']++;

            if(Arrays.equals(pCharTracker,sCharTracker))
                result.add(left);

        }
        return result;
    }

    }


