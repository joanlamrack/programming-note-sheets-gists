import java.util.HashMap;
import java.io.IOException;
import java.lang.InterruptedException;

public class BattleshipGame {
	char shotHit = 'X';
	char shotMiss = '-';
	HashMap<Character, Integer> enemiesData = null;
	int boardLength = 0;
	int boardLastIndex = boardLength - 1;
	char[][] board = null;

	public BattleshipGame(HashMap<Character, Integer> enemiesData, int boardLength) {
		this.enemiesData = enemiesData;
		this.boardLength = boardLength;
		this.board = BattleshipBoard.generateBoardWithEnemies(enemiesData, boardLength);
	}

	public void printBoard(){
		BattleshipBoard.printBoard(this.board);
	}

	public static void doSleep() {
		sleep(2000);
	}

	public static void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void doClearScreen() {
		try {
			ClearScreen();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void ClearScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}

	public void play(String[] shots){
		for(String shot: shots){
			takeShot(shot);
		}
	}

	private void takeShot(String shot){
		int rowCoordinate = shot.charAt(0) - 'A';
		int colCoordinate =  Integer.parseInt(shot.substring(1, shot.length()));
		board[rowCoordinate][colCoordinate] = checkShot(row, col);
	}

	

	private char checkShot(int row, int col){
		switch(board[row][col]){
			case 'X': 
			case ' ': return shotMiss;
		}
		return shotHit;
	}
}