package foundation.week6;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;




public class Week6_Day4_HW_CheckIfStraightLine{

	/* 
Leetcode link: https://leetcode.com/problems/check-if-it-is-a-straight-line/description/

Problem statement: 	
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. 
Check if these points make a straight line in the XY plane.

	Input 			----->  int[][]
	Output 			----->  boolean


	Data Set:
		 Positive: 	---> Input: [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]			Output =  true
		 Negative:  	---> Input: [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]		Output =  false
		 Edge: 		---> Input: [[1,1],[2,2]]									Output =  true


	Pseudo Code:
	1. Get the integer array and get the length of Row and columns.. Return false if the length<2
	2. Compare x wit the adjacent value and x1, same for y also.. Set the initial comparison point for both x anf y
	3. Loop through the array and check for all the points
	4. Return false if the values are not matching with any of the points
	5. Return True at the end

	 */

	@Test	
	public void positiveTest()
	{
		Assert.assertEquals(true, isStraightLine(new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
	}

	@Test	
	public void negativeTest()
	{
		Assert.assertEquals(false, isStraightLine(new int[][] {{1,2},{2,2},{3,4},{4,5},{5,6},{6,7}}));
	}

	@Test	
	public void edgeTest()
	{
		Assert.assertEquals(true, isStraightLine(new int[][] {{1,2},{2,2}}));
	}

	/*
	The point is if we take points p1(x, y), p2(x1, y1), p3(x3, y3), slopes of any two pairs is same then p1, p2, p3 lies on same line.
slope from p1 and p2 is y - y1 / x - x1
slope from p2 and p3 is y2 - y1 / x2 - x1
if these two slopes equal, then p1, p2, p3 lies on same line.

(y-y1)/y2-y1)=(x-x1)/(x2-x1)



	 */

	//Referred Solution
	public boolean onLine(int[] p1, int[] p2, int[] p3){
		int x = p1[0], y = p1[1], x1 = p2[0], y1 = p2[1], x2 = p3[0], y2 = p3[1];
		return ((y - y1) * (x2 - x1) == (y2 - y1) * (x - x1));
	}
	
	public boolean checkStraightLine(int[][] coordinates) {
		// base case:- there are only two points, return true
		// otherwise, check each point lies on line using above equation.

		for(int i=2;i<coordinates.length;i++){
			if(!onLine(coordinates[i], coordinates[0], coordinates[1]))
				return false;
		}
		return true;
	}


	public boolean isStraightLine(int[][] coordinates) 
	{
		int baseValue_x=coordinates[1][0]-coordinates[0][0];
		int baseValue_y=coordinates[1][1]-coordinates[0][1];		

		for (int x = 1; x < coordinates.length-1; x++) {			
			if((coordinates[x+1][0]-coordinates[x][0]!=baseValue_x)||(coordinates[x+1][1]-coordinates[x][1]!=baseValue_y))
				return false;
		}

		return true;	
	}

}
