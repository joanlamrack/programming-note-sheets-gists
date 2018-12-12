import java.util.Arrays;
import java.util.HashMap;
import java.io.IOException;
import java.lang.InterruptedException;

public class battleship {
	public static void main(String[] args) {
		char[][] board = generateBoard();

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

	public static char[][] generatePlainBoard(){
		char[][] board = new char[10][10];

		for(char[] row: board){
			 Arrays.fill(row, ' ');
		}

		return board;
	}

	public static char[][] generateBoardWithEnemies() {
		HashMap<Character, Integer> shipData = new HashMap<Character, Integer>();
		shipData.put('b', 4);
		shipData.put('c', 5);
		shipData.put('d', 2);

		

	}

	public static void printBoard(char[][] boardToPrint) {
		for (char[] row : boardToPrint) {
			System.out.println(Arrays.toString(row));
		}
	}
}