import java.util.Arrays;
import java.lang.Exception;

public class SudokuBoard {
	private int boardLength = 9;
	private int[][] board = new int[boardLength][boardLength];
	private int inputLength = boardLength * boardLength;

	public SudokuBoard(String sudokuvalue) {
		if (sudokuvalue.length() > inputLength) {

		}

	}

	// private int[][] fillSudokuBoard(String input) {

	// }

	private void extractIndexAndPlaceItOnBoard(int IndexonStringinput, String input) {
		for (int row = 0; row < boardLength; row++) {
			for (int col = 0; col < boardLength; col++) {
				int stringindex = (row + 1) * (col + 1);
				String extractedString = input.substring(stringindex, stringindex + 1);
				int convertedString = Integer.parseInt(extractedString);
				placeNumberOnBoard(row, col, convertedString );
			}
		}
	}

	private void placeNumberOnBoard(int rowIndex, int colIndex, int input) {
		this.board[rowIndex][colIndex] = input;
	}

	public void printBoard() {
		for (int[] row : this.board) {
			System.out.println(Arrays.toString(row));
		}
	}
}