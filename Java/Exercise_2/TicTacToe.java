import java.util.Random;

public class TicTacToe{
	public static void main(String[]args){

	}

	public static char[][] DoTicTacToe(){
		char[][] board = {
			{'-', '-', '-'},
			{'-', '-', '-'},
			{'-', '-', '-'}
		};

		return board;
	}

	public static boolean isX(){
		Random rand = new Random();
		return rand.nextInt(2);
	}
}