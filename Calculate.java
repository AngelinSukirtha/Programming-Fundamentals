package com.chainsys.day5;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*To calculate score boolean gameOver,int score, int levelCompleted, int bonus
		Create method
		    -basic
		    -method with proper return type*/

		// Create a (1st)method called displayHighScorePosition
		        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
		        // You should display the players name along with a message like " managed to get into position " and the
		        // position they got and a further message " on the high score table".
		      
		// Create a 2nd method called calculateHighScorePosition
		        // it should be sent one argument only, the player score
		        // it should return an in
		        // the return data should be
		        // 1 if the score is >=1000
		        // 2 if the score is >=500 and < 1000
		        // 3 if the score is >=100 and < 500
		        // 4 in all other cases
		        // call both methods and display the results of the following
		        // a score of 1500, 900, 400 and 50
		        //
		        boolean gameOver;
		        int score;
		        int levelCompleted;
		        int bonus;
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter your name");
		        String name=sc.nextLine();
		        System.out.println("Enter your high score position");
		        int p=sc.nextInt();
		        System.out.println("Enter your score");
		        int s=sc.nextInt();
		        displayHighScorePosition(name,p);
		        calculateHighScorePosition(s);
	}

		    private static void displayHighScorePosition(String name,int position) {
		        System.out.println(name + " managed to get into position ");
		        System.out.println( position +" position in high score Table" );
		    }
		    private static void calculateHighScorePosition(int score)
		    {
		    	if(score>=1000)
		    		System.out.println("1");
		    	else if(score>=500 && score<1000 )
		    		System.out.println("2");
		    	else if(score>=100 && score<500)
		    		System.out.println("3");
		    	else
		    		System.out.println("4");
		    }
}
/**/
