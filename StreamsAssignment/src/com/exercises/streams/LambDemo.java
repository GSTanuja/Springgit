package com.exercises.streams;

public class LambDemo {

	public static void main(String[] args) {
		IGames gamesref=(String[] games)->{
			
			for (String gamesName : games) {
System.out.print(  gamesName+", ");
			}
		};
		String[] games= {"Cricket","FootBall","TT","Chess"};
		gamesref.printGames(games);
	}
}
