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
			placeNumberOnBoard(row, col, Integer.parseInt(String.valueOf(inputConverted[index])));
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

	public boolean used_in_row (int row , int num){
		for(int col = 0 ; col < boardLength ; col++){
			if(this.board[row][col] == num){
				return true;
			}
		}
		return false;
	}
}