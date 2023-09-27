package foundation.week14;

import org.junit.Test;


public class Week14_Day2_HW_BowlingGame {

	/* 
Leetcode link: https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/


	Input 			----->  int[],int[]
	Output 			----->  int


Best Solution : https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/solutions/3468269/day-395-easy-100-0ms-python-java-c-explained-approach/


	 */

    @Test
    public void allTests() {

        //Positive
//        Assert.assertEquals("aidia", ReverseString("india"));



    }

    public int isWinner_BruteForce(int[] player1, int[] player2) {

        boolean flag1=false,flag2=false;

        int score1=0,score2=0,rowTracker1=0,rowTracker2=0;

        for(int i=0;i<player1.length;i++)
        {
            if((flag1)&&(i-rowTracker1<=2))
                score1+=2*player1[i];
            else
                score1+=player1[i];


            if(player1[i]==10)
            {
                flag1=true;
                rowTracker1=i;

            }



            if((flag2)&&(i-rowTracker2<=2))
                score2+=2*player2[i];
            else
                score2+=player2[i];

            if(player2[i]==10)
            {
                flag2=true;
                rowTracker2=i;
            }

        }

        System.out.println("Score1: "+score1+"...Score2: "+score2);

        int res;
        if(score1>score2)
            res=1;
        else if(score2>score1)
            res=2;
        else
            res=0;

        return res;


    }

    public int isWinner_Siva(int[] player1, int[] player2) {
        int player1Score = 0, player2Score = 0;
        for (int i = 0; i < player1.length; i++) {
            if(i == 1 && player1[i - 1] == 10)
                player1Score += 2 * player1[i];
            else if(i>=2 && (player1[i - 1] == 10 || player1[i - 2] == 10))
                player1Score += 2 * player1[i];
            else
                player1Score += player1[i];

            if(i == 1 && player2[i - 1] == 10)
                player2Score += 2 * player2[i];
            else if(i>=2 && (player2[i - 1] == 10 || player2[i - 2] == 10))
                player2Score += 2 * player2[i];
            else
                player2Score += player2[i];
        }
        if(player1Score==player2Score)
            return 0;
        else
            return (player1Score>player2Score) ? 1 : 2;
    }


}

