/*
* Reimplementation of Sudoku Solver with backtrack
* https://medium.com/@george.seif94/solving-sudoku-using-a-simple-search-algorithm-3ac44857fee8
*/


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

	private boolean used_in_row (int row , int num, int[][] board){
		for(int col = 0 ; col < boardLength ; col++){
			if(board[row][col] == num){
				return true;
			}
		}
		return false;
	}

	private boolean used_in_col (int col, int num, int[][] board){
		for(int row = 0 ; row < boardLength ; row++){
			if(board[row][col]==num){
				return true;
			}
		}
		return false;
	}

	private boolean used_in_box (int startRow, int startCol, int num, int[][] board){
		for(int row = 0 ; row < 3 ; row++){
			for(int col = 0 ; col < 3 ; col++){
				if(board[row+startRow][col+startCol]== num ){
					return true;
				}
			}
		}
		return false;
	}
 
	private boolean is_safe(int row, int col, int num, int[][] board){
		return !used_in_box(row - row % 3, col - col % 3, num, board) &&
				!used_in_col(col, num, board) &&
				!used_in_row(row, num, board);
	} 
}