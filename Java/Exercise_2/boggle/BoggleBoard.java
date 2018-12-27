import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BoggleBoard {
	char[][] board = null;

	public BoggleBoard() {
	}

	private int generateRandomintWithinRange(int max) {
		Random rand = new Random();
		int output = rand.nextInt(max);
		return output;
	}

	private char generateRandomAlphabet() {
		char output = 'A';
		output += this.generateRandomintWithinRange(26);
		return output;
	}

	public char[][] shake(int boardLength) {
		char[][] output = new char[boardLength][boardLength];

		for (int row = 0; row < boardLength; row++) {
			for (int col = 0; col < boardLength; col++) {
				output[row][col] = generateRandomAlphabet();
			}
		}

		this.board = output;

		return output;
	}

	public void printBoard() {
		for (char[] row : this.board) {
			System.out.println(Arrays.toString(row));
		}
	}

	public void solve() {
		for (int row = 0; row < this.board.length; row++) {
			for (int col = 0; col < this.board.length; col++) {

			}
		}
	}

	public boolean isThisWordFound(String word, char[][] board) {

		return false;
	}

	public boolean searchAroundCoordinate(int row, int col, String word, char[][] board,
			ArrayList<int[]> coordinatesPassed) {

			

		return false;
	}

	public boolean isThisCoordinateAlreadyPassed(int row, int col, ArrayList<int[]> coordinatesPassed) {
		for (int[] coordinate : coordinatesPassed) {
			int coordinateRow = coordinate[0];
			int coordinateCol = coordinate[1];
			if ((coordinateRow == row) && (coordinateCol == col)) {
				return true;
			}
		}
		return false;
	}
}