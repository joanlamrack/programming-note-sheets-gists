import java.util.Arrays;
import java.lang.Exception;

public class SudokuBoard {
	private int boardLength = 9;
	private int[][] board = new int[boardLength][boardLength];
	private int inputLength = boardLength * boardLength;

	public SudokuBoard(String sudokuvalue) {
		fillSudokuBoard(sudokuvalue);
	}

	private void fillSudokuBoard(String input) {
		char[] inputConverted = input.toCharArray();
		for (int row = 0; row < boardLength; row++) {
			for (int col = 0; col < boardLength; col++) {
				int stringindex = (row + 1) * (col + 1);
				char extractedString = inputConverted[stringindex];
				int convertedString = Integer.parseInt(String.valueOf(extractedString));
				placeNumberOnBoard(row, col, convertedString);
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