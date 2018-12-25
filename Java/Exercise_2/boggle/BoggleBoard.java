import java.util.Arrays;

public class BoggleBoard {
	char[][] board = null;

	public BoggleBoard(int boardLength) {
	}

	public char[][] shake(int boardLength) {
		char[][] output = new char[4][4];

		return output;
	}

	public void printBoard() {
		for (char[] row : this.board) {
			System.out.println(Arrays.toString(row));
		}
	}
}