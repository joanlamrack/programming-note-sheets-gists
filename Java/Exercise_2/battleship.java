import java.util.Arrays;
import java.util.HashMap;
import java.io.IOException;
import java.lang.InterruptedIOException;

public class battleship{
	public static void main(String[]args){
		char[][] board = generateBoard();

		printBoard(board);
		
	}

	public static void doSleep(){
		sleep(2000);
	}

	public static void sleep(int milliseconds){
		Thread.sleep(milliseconds);
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

	public static char[][] generateBoard(){
		HashMap<Character,Integer> shipData = new HashMap<Character,Integer>();
		shipData.put('b', 4);
		shipData.put('c', 5);
		shipData.put('d', 2);

		char[][] board = new char[10][10];

		return board;

	}

	public static void printBoard(char[][] boardToPrint){
		for(char[] row : boardToPrint){
			System.out.println( Arrays.toString(row) );
		}
	}
}