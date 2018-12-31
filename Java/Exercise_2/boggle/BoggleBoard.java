import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BoggleBoard {
	char[][] board = null;
	ArrayList<String> wordsFound = new ArrayList<String>();

	public BoggleBoard() {
	}

	private int generateRandomintWithinRange(int max) {
		Random rand = new Random();
		int output = rand.nextInt(max);
		return output;
	}

	private char generateRandomAlphabet() {
		char output = 'A';
		output += this.generateRandomintWithinRange(26);
		return output;
	}

	public char[][] shake(int boardLength) {
		char[][] output = new char[boardLength][boardLength];

		for (int row = 0; row < boardLength; row++) {
			for (int col = 0; col < boardLength; col++) {
				output[row][col] = generateRandomAlphabet();
			}
		}

		this.board = output;

		return output;
	}

	public void printBoard() {
		for (char[] row : this.board) {
			System.out.println(Arrays.toString(row));
		}
	}

	public void solve(char[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				for(String word : data.getData()){
					boolean wordFound = isThisWordFound(row, col, word, board);
					if(wordFound == true){
						addWordsFound(word);
					}
				}
			}
		}
	}

	private void addWordsFound(String wordToBeAdded){
		this.wordsFound.add(wordToBeAdded);
	}

	private void printWordFound(){
		System.out.println( this.wordsFound.toString() );
	}

	public boolean isThisWordFound(int row, int col, String word, char[][] board) {
		ArrayList<int[]> coordinatesPassed = new ArrayList<int[]>();
		if(searchAroundCoordinate(row, col, word, board, coordinatesPassed) == true){
			return true;
		}
		return false;
	}

	public boolean searchAroundCoordinate(int row, int col, String word, char[][] board,
			ArrayList<int[]> coordinatesPassed) {
			for(String direction : BoogleDirection.getDirections()){
				int rowAfterTranslation = row + BoogleDirection.getRowTranslation(direction);
				int colAfterTranslation = col + BoogleDirection.getColTranslation(direction);
				
				if((board[rowAfterTranslation][colAfterTranslation] == word.charAt(0)) && (isThisCoordinateAlreadyPassed(rowAfterTranslation, colAfterTranslation, coordinatesPassed) == false)){
					coordinatesPassed.add( new int[] {rowAfterTranslation, colAfterTranslation});
					return  searchAroundCoordinate(rowAfterTranslation , colAfterTranslation, word.substring(1), board, coordinatesPassed)
				}

			}

		return false;
	}

	public boolean isThisCoordinateAlreadyPassed(int row, int col, ArrayList<int[]> coordinatesPassed) {
		for (int[] coordinate : coordinatesPassed) {
			int coordinateRow = coordinate[0];
			int coordinateCol = coordinate[1];
			if ((coordinateRow == row) && (coordinateCol == col)) {
				return true;
			}
		}
		return false;
	}
}