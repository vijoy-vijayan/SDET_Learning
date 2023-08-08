package week2.day1;

import org.junit.Assert;
import org.junit.Test;

/* 

Problem Statement:
	Given a sorted character array and a target character, find the next biggest character in the array. 
	Example:
	char[] cha = {‘b’, ‘d’ , ‘h’}; char k = ‘e’ 
	Output -> h



 Input  ----> char array
 Output ----> char

 Data Set:
 	Positive 	----> 		Input : {‘b’, ‘d’ , ‘h’} 		Target:'e'   Output = 'h'
 	Negative 	---->		Input : {‘v’, ‘i’ , ‘j’}		Target:'o'   Output = 'null'
 	Edge 	  	---->		Input : {‘v’, ‘i’ , ‘j’} 		Target:'j'   Output = 'null'

 Pseudo Code:
	 1. Get the character array and Target char
	 2. Iterate through the sorted array and compare the target char with the elements as int comparison
	 3. return the first element if the condition is satisified
	 4. Return empty char at the end of the program

 */

public class Week2_HW1_FindBiggestCharacter {

	@Test
	public void positiveTest()
	{
		Assert.assertEquals('h',FindBigCharacter(new char[] {'b', 'd' , 'h'},'e'));
	}

	@Test
	public void negativeTest()
	{
		System.out.println("Negative:"+(int)(FindBigCharacter(new char[] {'i','j','k'},'o')));
		Assert.assertEquals(' ',FindBigCharacter(new char[] {'i','j','k'},'o'));
	}

	@Test
	public void edgeTest()
	{
		System.out.println("Edge: "+FindBigCharacter(new char[] {'i' , 'j','k'},'k'));
		Assert.assertEquals(' ',FindBigCharacter(new char[] {'i' , 'j','k'},'k'));
	}


	public char FindBigCharacter(char[] inpCharArr, char target)
	{
		for(int i=0;i<inpCharArr.length;i++)
		{
			if(inpCharArr[i]>target)
				return inpCharArr[i];

		}

		return ' ';
	}

}
