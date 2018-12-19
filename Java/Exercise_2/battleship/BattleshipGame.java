import java.util.HashMap;
import java.io.IOException;
import java.lang.InterruptedException;

public class BattleshipGame {
	private char shotHit = 'X';
	private char shotMiss = '-';
	private HashMap<Character, Integer> enemiesData = null;
	private int boardLength = 0;
	private int boardLastIndex = boardLength - 1;
	private char[][] board = null;
	private String message = "";
	private int shotsCount = 0;
	private int shotsMissCount = 0;
	private int shotsHitsCount = 0;

	public BattleshipGame(HashMap<Character, Integer> enemiesData, int boardLength) {
		this.enemiesData = enemiesData;
		this.boardLength = boardLength;
		this.board = BattleshipBoard.generateBoardWithEnemies(enemiesData, boardLength);
	}

	private void printBoard() {
		BattleshipBoard.printBoard(this.board);
	}

	private void printFleetStats(){
		System.out.println("\n --------------FLEET STATS--------------");
		for( Character oneShip : this.enemiesData.keySet() ){
			int healthBar = enemiesData.get(oneShip);
			System.out.println(oneShip +" life: "+healthBar);
		}
	}
	
	private void printPlayerStats(){
		System.out.println("\n --------------PLAYER STATS--------------");
		System.out.println("Shots taken \t"+ this.shotsCount);
		System.out.println("Shots hit \t"+this.shotsHitsCount);
		System.out.println("Shots missed \t"+this.shotsMissCount);
	}

	private static void doSleep() {
		sleep(2000);
	}

	private static void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void doClearScreen() {
		try {
			ClearScreen();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void ClearScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}

	public void play(String[] shots) {
		this.shotsCount = shots.length;
		for (String shot : shots) {
			takeShot(shot);
			doClearScreen();
			printBoard();
			printMessage();
			doSleep();
		}
		printPlayerStats();
		printFleetStats();
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
			this.shotsHitsCount++;
			char fleetMarker = board[rowCoordinate][colCoordinate];
			reduceFleetHealth(fleetMarker);
			checkIfFleetSink(fleetMarker);
		}
		else{
			this.shotsMissCount++;
		}
		board[rowCoordinate][colCoordinate] = placeShot(isShotHit);
	}

	private char placeShot(boolean isShotHit){

		return isShotHit == true ? this.shotHit : this.shotMiss;
	}

	private boolean shotHit(int row, int col) {
		switch (board[row][col]) {
		case 'X':
		case ' ':
			setMessage("You Miss!");
			return false;
		}
		setMessage("You hit "+board[row][col]);
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
			setMessage(fleetMarker + " sinks!");
		}
	}

	private void printMessage(){
		System.out.println(this.message);
		this.message="";
	}

	private void setMessage(String message){
		this.message = message;
	}
}