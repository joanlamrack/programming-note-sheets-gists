import java.util.Arrays;

public class SudokuBoard {
	private int boardLength = 9;
	private int[][] board = new int[boardLength][boardLength];
	private int inputLength = boardLength * boardLength;

	public SudokuBoard(String sudokuvalue) {
		fillSudokuBoard(sudokuvalue);
	}

	private void fillSudokuBoard(String input) {
		char[] inputConverted = input.toCharArray();
		for (int index = 0; index < inputLength; index++) {
			int col = index % boardLength;
			int row = index / 9;

			placeNumberOnBoard(row, col, inputConverted[index]);
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