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
	String message = "";

	public BattleshipGame(HashMap<Character, Integer> enemiesData, int boardLength) {
		this.enemiesData = enemiesData;
		this.boardLength = boardLength;
		this.board = BattleshipBoard.generateBoardWithEnemies(enemiesData, boardLength);
	}

	public void printBoard() {
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

	public void play(String[] shots) {
		for (String shot : shots) {
			takeShot(shot);
			doClearScreen();
			printBoard();
			doSleep();
			
		}
	}

	private void takeShot(String shot) {
		int rowCoordinate = shot.charAt(0) - 'A';
		int colCoordinate = Integer.parseInt(shot.substring(1, shot.length())) - 1;

		if (rowCoordinate > 10) {
			rowCoordinate = 10;
		} else if (rowCoordinate < 0) {
			rowCoordinate = 0;
		}

		if (colCoordinate > 9) {
			colCoordinate = 9;
		} else if (colCoordinate < 0) {
			colCoordinate = 0;
		}

		boolean isShotHit = shotHit(rowCoordinate , colCoordinate);
		if(isShotHit == true){
			char fleetMarker = board[rowCoordinate][colCoordinate];
			reduceFleetHealth(fleetMarker);
			checkIfFleetSink(fleetMarker);
		}
		board[rowCoordinate][colCoordinate] = placeShot(isShotHit);
	}

	private char placeShot(boolean isShotHit){
		return isShotHit == true ? shotHit : shotMiss;
	}

	private boolean shotHit(int row, int col) {
		switch (board[row][col]) {
		case 'X':
		case ' ':
			return false;
		}
		return true;
	}

	private void reduceFleetHealth(char fleetMarker){
		int enemyHealth = enemiesData.get(fleetMarker);
		enemyHealth--;
		enemiesData.put(fleetMarker, enemyHealth);
	}

	private void checkIfFleetSink(char fleetMarker){
		int enemyHealth = enemiesData.get(fleetMarker);
		if(enemyHealth <= 0){
			System.out.println(fleetMarker +" sinks!");
		}
	}

	private void printMessage(){
		System.out.println(this.message);
		this.message="";
	}
}