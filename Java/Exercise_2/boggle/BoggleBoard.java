import java.util.Arrays;
import java.java.util.Random;

public class BoggleBoard {
	char[][] board = null;

	public BoggleBoard(int boardLength) {
	}

	public int generateRandomintWithinRange(int max) {
		Random rand = new Random();
		int output = rand.nextInt(max);
		return output;
	}

	public char generateRandomAlphabet(){
		char output = 'A';
		output+= this.generateRandomintWithinRange(26);
		return output;
	}

	public char[][] shake(int boardLength) {
		char[][] output = new char[boardLength][boardLength];

		for(int row = 0 ; row < boardLength ; row++){
			for(int col = 0 ; col < boardLength; col++){
				output[row][col] = generateRandomAlphabet();
			}
		}

		return output;
	}

	public void printBoard() {
		for (char[] row : this.board) {
			System.out.println(Arrays.toString(row));
		}
	}
}