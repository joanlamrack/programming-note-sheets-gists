import java.util.Arrays;

public class sudokusolver {
	public static void main(String[] args) {
		String fromFile = FileReader.doReadFile("set01-unsolved.txt");
		String[] inputs = FileReader.separateByEnter(fromFile);

		SudokuBoard board = new SudokuBoard(inputs[0]);
		board.printBoard();
	}
}