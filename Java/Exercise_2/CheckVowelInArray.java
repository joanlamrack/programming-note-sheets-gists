import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CheckVowelInArray{
	public static void main(String[]args){
		System.out.println( Arrays.deepToString( generateRandomAlphabetArray(10, 10) ) );
	}

	public static Character[][] generateRandomAlphabetArray(int row, int col){
		ArrayList<Character[]> output = new ArrayList<Character[]>();

		for(int startRow = 0; startRow < row; startRow++){
			ArrayList<Character> rowRandom = new ArrayList<Character>();
			for(int startCol = 0; startCol < col; startCol++){
				rowRandom.add( (char)( generateRandomintWithinRange(0, 25)+'a') );
			}
			output.add( rowRandom.toArray(new Character[rowRandom.size()]) );
		}

		return output.toArray( new Character[row][] );
	}

	public static String searchAlphabetBlock(char[][] arrayToSearchVowel){
		for(int row = 0 ; row < arrayToSearchVowel.length ; arrayToSearchVowel++){
			
		}
	}

	public static int generateRandomintWithinRange(int min, int max){
		Random rand = new Random();
		return rand.nextInt(25) + 1;
	}
}