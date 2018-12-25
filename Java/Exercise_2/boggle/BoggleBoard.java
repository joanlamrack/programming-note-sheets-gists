import java.util.Arrays;

public class BoggleBoard {
	char[][] board = null;

	public BoggleBoard(int boardLength) {
	}

	public static int generateRandomintWithinRange(int max) {
		Random rand = new Random();
		int output = rand.nextInt(max);
		return output;
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