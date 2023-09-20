package foundation.week12;

import java.lang.String;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;



public class Week12_Day4_HW_DecodeTheMessage {

	/* 
Leetcode link: https://leetcode.com/problems/decode-the-message/description/

Problem statement: 	
You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.


	Input 			----->  String, String
	Output 			----->  String

	Data Set:
		 Positive: 	---> Input: [1,3,2,4,5],5			    Output =  1
		 Negative: 	---> Input: [1,2,3,4,5],6			    Output =  0
		 Edge: 	    ---> Input: [3,6,5,4,1],1			    Output =  5
		 Edge: 	    ---> Input: [1],1				        Output =  0



	Pseudo code:
    1. Get the cipherkey and Secret message
    2. Remove al duplicate characters from the String using String builder
    3. Assing the unique values to the char array
    4. Iterate through the secret message by each character
    5. Replace it with the charArray element in result String builder
    6. Handle the spaces in the logic
    7. Return result

	 */

    @Test
    public void allTests() {

        //Positive
//        Assert.assertEquals(63, decodeMessage("aacd","abc"));

        decodeMessage("viiiiii","v");//ashi

    }

    public String decodeMessage(String key, String message) {

        StringBuilder uniqueString=new StringBuilder(key.replace(" ",""));

        String name="Karthik";

        name=name+" D";


        int temp=uniqueString.length();
        for (int i = 0; i < temp; i++) {//ab   cde

//            System.out.println("i ---> "+uniqueString.charAt(i));

            for(int j=i+1;j<temp;j++)
            {
//                System.out.println("j ---> "+uniqueString.charAt(j));
                if(uniqueString.charAt(i)==uniqueString.charAt(j)) {
                    uniqueString.deleteCharAt(j);
                    break;
                }
            }

            //System.out.println("Updated String ---> "+uniqueString.toString());

        }
        System.out.println("Updated String ---> "+uniqueString.toString());

       /* char[] mapCipherKey=new char[26];

        for(int i=0;i<mapCipherKey.length;i++)
        {
            mapCipherKey[i]=uniqueString.charAt(i);
        }

        System.out.println("Character Array: "+Arrays.toString(mapCipherKey));

        StringBuilder result=new StringBuilder();
        for(int i=0;i<message.length();i++)
        {

            if(message.charAt(i)==32)
            {
                result.append(message.charAt(i));
                continue;
            }

//            int index = message.charAt(i) - 'a';

            for(int j=0;j<mapCipherKey.length;j++)
            {
                if(message.charAt(i)==mapCipherKey[j]) {
                    System.out.println(j);
                    result.append(mapCipherKey[j] + 'a');
                }
            }

        }
*/


        return uniqueString.toString();
    }


}

