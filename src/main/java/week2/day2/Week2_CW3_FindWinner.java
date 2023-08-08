package week2.day2;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: 

You are given an integer n, the number of teams in a tournament that has strange rules:

If the current number of teams is even, each team gets paired with another team. 
A total of n / 2 matches are played, and n / 2 teams advance to the next round.

If the current number of teams is odd, 
one team randomly advances in the tournament, and the rest gets paired. 
A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.

Return the number of matches played in the tournament until a winner is decided.


Input 			----->  	int
Output 			----->  	int


Data Set:
	 Positive: 	{1, 1, 2, 2, 2, 2, 3} 		target = 2 			---> 		Output = 2
	 Negative: 	{5,5,6,8,9,9,9} 			target = 4 			---> 		Output = 0
	 Edge: 		{1, 1, 1,1} 				target = 1 			---> 		Output = 4

Pseudo Code:
	 1. Get the noOfTeams and initialise the matches and the remainingTeams
	 2. Loop through the loop until the remainingTeams>1 
	 3. If team is Even, calculate matches = matches/2 .. remainingTeams=remainingTeams/2 .. calculate matches
	 4. If Team is Odd, calculate matches = (matches-1)/2 .. remainingTeams=(remainingTeams-1/2)+1.. calculate matches
	 3. Return matches

 */

public class Week2_CW3_FindWinner {

	@Test
	public void positiveTest()
	{
		Assert.assertEquals(6,findTotalMatches(7));
		Assert.assertEquals(13,findTotalMatches(14));
	}

	//	@Test
	//	public void negativeTest()
	//	{
	//		Assert.assertEquals(1,1);
	//	}
	//	
	//	@Test
	//	public void edgeTest()
	//	{
	//		Assert.assertEquals(1,1);
	//	}


	public int findTotalMatches(int noOfTeams)
	{
		int matches=0;

		while(noOfTeams>1)
		{
			if(noOfTeams%2==0)
			{
				matches =matches+noOfTeams/2;
				noOfTeams=noOfTeams/2;				
			}
			else
			{
				matches =matches+(noOfTeams-1)/2;
				noOfTeams=((noOfTeams-1)/2)+1;				
			}
		}
		return matches;
	}

}
