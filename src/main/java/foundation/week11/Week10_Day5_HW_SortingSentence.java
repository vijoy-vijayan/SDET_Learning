package foundation.week11;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class Week10_Day5_HW_SortingSentence {

	/* 
Leetcode link: https://leetcode.com/problems/sorting-the-sentence/

Problem statement: 	
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.


	Input 			----->  String
	Output 			----->  String

	Data Set:
		 Positive: 	---> Input: "sensitive4 Fishes1 very3 are2"				Output =  "Fishes are very sensitive"
		 Negative: 		---> Input: "cat3 elephant5 anaconda1 bear2 dog4"	Output =  "anaconda bear cat dog elephant"
		 Edge: 	---> Input: "Leaf2 Test1"									Output= "Test Leaf"
		 Edge: 	---> Input: "Vijoy"											Output= "Vijoy"


	Pseudo Code:
	1. Get the input String and split with space to find the number of words.. Initialise the result
	2. Iterate through the splitted array output starting the index with 1 to the lenght of array
	3. Get the last character i.e number from the word
	4. COmpare the number fetched with the index
	5. If true --> append the word with the result
	6. Continue the step 2 to 5 for all inputs
	7. Return the result at the end


	Best Solution: https://leetcode.com/problems/sorting-the-sentence/solutions/1213443/java-simple-solution-runtime-0-ms-o-n/

	Learning: Could have made use of Split array itself as we already have index in Input String

	 */

    @Test
    public void allTests() {

        //Positive
        Assert.assertEquals("Fishes are very sensitive", sortSentence("sensitive4 Fishes1 very3 are2"));
        Assert.assertEquals("anaconda bear cat dog elephant", sortSentence("cat3 elephant5 anaconda1 bear2 dog4"));
        //Negative
        Assert.assertEquals("Test Leaf", sortSentence("Leaf2 Test1"));
        //Edge
        Assert.assertEquals("Vijoy", sortSentence("Vijoy1"));

    }

	@Test
	public void secondMethod() {

		//Positive
		Assert.assertEquals("Fishes are very sensitive", sortSentence_NewLogic("sensitive4 Fishes1 very3 are2"));
		Assert.assertEquals("anaconda bear cat dog elephant", sortSentence_NewLogic("cat3 elephant5 anaconda1 bear2 dog4"));
		//Negative
		Assert.assertEquals("Test Leaf", sortSentence_NewLogic("Leaf2 Test1"));
		//Edge
		Assert.assertEquals("Vijoy", sortSentence_NewLogic("Vijoy1"));

	}


    public String sortSentence(String s) {//O(N^2)

        StringBuilder result = new StringBuilder();

        String[] arrWords = s.split(" ");

        if (arrWords.length == 1)
            return s.substring(0, s.length() - 1);


        for (int index = 1; index <= arrWords.length; index++) {

            for (int i = 0; i < arrWords.length; i++) {

                int wordIndex = (arrWords[i].charAt(arrWords[i].length() - 1)) - '0';

                if (wordIndex == index) {
                    result.append(arrWords[i].substring(0, arrWords[i].length() - 1) + " ");
                    break;
                }

            }

        }

        result.deleteCharAt(result.length() - 1);

        return result.toString();

    }

    public String sortSentence_NewLogic(String s) {//O(N Log N)

        StringBuilder result = new StringBuilder();

        String[] arrWords = s.split(" ");

        if (arrWords.length == 1)
            return s.substring(0, s.length() - 1);


        for (int i = 0; i < arrWords.length; i++) {
            arrWords[i]=arrWords[i].charAt(arrWords[i].length() - 1)+arrWords[i].substring(0, arrWords[i].length() - 1);
        }

		Arrays.sort(arrWords);

		for (int i = 0; i < arrWords.length; i++) {
			result.append(arrWords[i].substring(1, arrWords[i].length()) + " ");
		}

        result.deleteCharAt(result.length() - 1);

        return result.toString();

    }
}

