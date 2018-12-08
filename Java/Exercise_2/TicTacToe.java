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

		int Xcount = 0;
		int Ocount = 0;

		for(int rowIndex = 0 ; rowIndex < board.length ; rowIndex++){
			for(int colIndex = 0 ; colIndex < board[0].length ; colIndex++){
				if(isX() && ((Xcount == 5 && Ocount == 4 ) || (Ocount == 5 && Xcount == 5))){
					board[rowIndex][colIndex] = 'X';
				}
				else{
					board[rowIndex][colIndex] = 'O';
				}
			}
		}

		return board;
	}

	public static boolean isX(){
		Random rand = new Random();
		return rand.nextInt(2);
	}
}