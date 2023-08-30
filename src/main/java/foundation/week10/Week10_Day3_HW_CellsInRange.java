package foundation.week10;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Week10_Day3_HW_CellsInRange {

	/* 
Leetcode link: https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/

Problem statement: 	
A cell (r, c) of an excel sheet is represented as a string "<col><row>" where:

<col> denotes the column number c of the cell. It is represented by alphabetical letters.
For example, the 1st column is denoted by 'A', the 2nd by 'B', the 3rd by 'C', and so on.
<row> is the row number r of the cell. The rth row is represented by the integer r.
You are given a string s in the format "<col1><row1>:<col2><row2>", where <col1> represents the column c1,
<row1> represents the row r1, <col2> represents the column c2, and <row2> represents the row r2,
such that r1 <= r2 and c1 <= c2.

Return the list of cells (x, y) such that r1 <= x <= r2 and c1 <= y <= c2.
The cells should be represented as strings in the format mentioned above and be sorted in non-decreasing
order first by columns and then by rows.

Return the merged string.

	Input 			----->  String
	Output 			----->  List<String>

	Data Set:
		 Positive: 	---> Input: "C1:D2"					Output =  ["C1","C2","D1","D2"]
		 Negative: 	---> Input: "U8:V9"					Output =  ["U8","U9","V8","V9"]
		 Edge:  	---> Input: "Z1:Z2"					Output =  ["Z1","Z2"]

	Pseudo Code:
	1. Get the input String and derive row1,row2,col1,col2 by getting the respective characters
	2. Create a nested loop, Loop through the row with initial value as row1 and end value as row2, increment by 1
	3. In the inner loop, loop through with the initial value as col1 and end value as col2
	4. In the FinalList variable, add the respective row and col value as String
	5. Return FinalList at the end

	 */

	@Test
	public void positiveTest()
	{
		List<String> expected= Arrays.asList("C1","C2","D1","D2");
		Assert.assertEquals(expected, getRangeOfCells("C1:D2"));
	}
	@Test
	public void negativeTest()
	{
		List<String> expected= Arrays.asList("U8","U9","V8","V9");
		Assert.assertEquals(expected, getRangeOfCells("U8:V9"));
	}
	@Test
	public void edgeTest()
	{
		List<String> expected= Arrays.asList("Z1","Z2");
		Assert.assertEquals(expected, getRangeOfCells("Z1:Z2"));
	}




	public List<String> getRangeOfCells(String s) {//K1:L2

		List<String> finalList=new ArrayList<>();

		for (char i = s.charAt(0); i <= s.charAt(3); i++) {
			for (int j=s.charAt(1)-'0'; j <=s.charAt(4)-'0' ; j++) {
				finalList.add(i + "" + j);
			}
		}

		return finalList;
	}

	public int getRowEndIndex(String cell)
	{
		int ctr=0;
		char ch;
		int temp=cell.length();

		while(ctr<temp)
		{
			ch=cell.charAt(ctr);

			System.out.println(ch);
			if(!(ch>=65)&&(ch<=90))
				break;

			ctr++;

		}

		return ctr;
	}



}

