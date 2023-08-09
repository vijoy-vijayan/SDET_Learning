package foundation.week5;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;




public class CW_MentorConnect_ReturnLargest4Chars {

	/* 
	Problem statement: 	 

	 
	Input 			----->  	char[]
	Output 			----->  	char[]
	 
	 
	Data Set:
		 Positive: 	---> Input: {'a','b','c','d','s','t','u','v'}		Output = {'v','u','t','s'}
		 Negative: 	---> Input: 		Output = 
		 Edge: 		---> Input: 		Output = 
	 
	Pseudo Code:
		
		 
	 
	 */
	
	@Test	
	public void test()
	{
		Assert.assertArrayEquals(new char[] {'v','u','t','s'}, findLargestChars(new char[] {'a','b','c','d','s','t','u','v'}));
	}
	
	public char[] findLargestChars(char[] inputArr)
	 {
		
		Arrays.sort(inputArr);
		
		char[] outputArr=new char[4];
		
		for (int i = 0; i < outputArr.length; i++) 			
			outputArr[i]=inputArr[inputArr.length-i-1];
				
		return outputArr;
	 }
	
	
}
