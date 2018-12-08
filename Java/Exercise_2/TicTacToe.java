import java.util.Arrays;
import java.util.Random;

public class TicTacToe {
	public static void main(String[] args) {
		char[][] generatedBoard = DoTicTacToe();

		PrintTicTacToe(generatedBoard);
	}

	public static char[][] DoTicTacToe() {
		char[][] board = { { '-', '-', '-' }, { '-', '-', '-' }, { '-', '-', '-' } };

		int Xcount = 0;
		int Ocount = 0;

		for (int rowIndex = 0; rowIndex < board.length; rowIndex++) {
			for (int colIndex = 0; colIndex < board[0].length; colIndex++) {
				if ((isX() == true) && (Xcount < 5) || Ocount == 5) {
					board[rowIndex][colIndex] = 'X';
					Xcount++;
				} else {
					board[rowIndex][colIndex] = 'O';
					Ocount = Ocount + 1;
				}
			}
		}

		return board;
	}

	public static void PrintTicTacToe(char[][] board) {
		for (char[] row : board) {
			System.out.println(Arrays.toString(row));
		}
	}

	public static boolean isX() {
		Random rand = new Random();
		int randomInt = rand.nextInt(2);
		boolean itWillBeX = 1 == randomInt;
		return itWillBeX;
	}
}