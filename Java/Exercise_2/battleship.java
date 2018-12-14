import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.io.IOException;
import java.lang.InterruptedException;

public class battleship {

	static int boardLength = 10;

	public static void main(String[] args) {
		char[][] board = generateBoardWithEnemies();

		printBoard(board);

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

	public static char[][] generatePlainBoard() {
		char[][] board = new char[boardLength][boardLength];

		for (char[] row : board) {
			Arrays.fill(row, ' ');
		}

		return board;
	}

	public static char[][] generateBoardWithEnemies() {
		HashMap<Character, Integer> shipData = new HashMap<Character, Integer>();
		shipData.put('b', 4);
		shipData.put('c', 5);
		shipData.put('d', 2);

		char[][] board = generatePlainBoard();

		putEnemyOnBoard(board, 2, 2, 'e', 4, false);

		return board;

	}

	public static int generateRandomintWithinRange(int max) {
		Random rand = new Random();
		return rand.nextInt(max) + 1;
	}

	public static void putEnemiesOnBoard(char[][] board, HashMap<Character, Integer> enemiesData) {

	}

	public static void putEnemyOnBoard(char[][] board, int placementRow, int placementColumn, Character fleetMarker,
			int fleetLength, boolean isHorizontal) {
		if (isHorizontal == true) {
			for (int col = placementColumn; col < placementColumn + fleetLength; col++) {
				board[placementRow][col] = fleetMarker;
			}
		} else {
			for (int row = placementRow; row < placementRow + fleetLength; row++) {
				board[row][placementColumn] = fleetMarker;
			}
		}
	}

	public static boolean checkPlacement(char[][] board, int placementRow, int placementColumn, int fleetLength,
			boolean isHorizontal) {
		return true;
	}

	public static void printBoard(char[][] boardToPrint) {
		for (char[] row : boardToPrint) {
			System.out.println(Arrays.toString(row));
		}
	}
}