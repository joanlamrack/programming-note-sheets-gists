import java.util.Arrays;

public class SudokuBoard{
	private int[][] board = new int[9][9];
	private int boardLength = 9;

	public SudokuBoard(String sudokuvalue){

	}

	private int[][] fillSudokuBoard(String input){
		
	}

	// private 

	// private void placeNumberOnBoard(int rowIndex, int colIndex, int input){

	// }

	public void printBoard(){
		for(int[] row: this.board){
			System.out.println( Arrays.toString(row) );
		}
	}
}