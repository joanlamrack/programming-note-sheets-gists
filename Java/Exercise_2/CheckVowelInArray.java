import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CheckVowelInArray {
	public static void main(String[] args) {
		Character[][] arrayTOSearch = generateRandomAlphabetArray(10, 10);

		System.out.println(Arrays.deepToString(arrayTOSearch));

		System.out.println(isVowel('a'));

		System.out.println( searchAlphabetBlock(arrayTOSearch) );
	}

	public static Character[][] generateRandomAlphabetArray(int row, int col) {
		ArrayList<Character[]> output = new ArrayList<Character[]>();

		for (int startRow = 0; startRow < row; startRow++) {
			ArrayList<Character> rowRandom = new ArrayList<Character>();
			for (int startCol = 0; startCol < col; startCol++) {
				rowRandom.add((char) (generateRandomintWithinRange(0, 25) + 'a'));
			}
			output.add(rowRandom.toArray(new Character[rowRandom.size()]));
		}

		return output.toArray(new Character[row][]);
	}

	public static String searchAlphabetBlock(Character[][] arrayToSearchVowel) {

		for (int row = 0; row < arrayToSearchVowel.length - 1; row++) {
			for (int col = 0; col < arrayToSearchVowel[0].length - 1; col++) {
				if (isVowel(arrayToSearchVowel[row][col]) && isVowel(arrayToSearchVowel[row + 1][col])
						&& isVowel(arrayToSearchVowel[row][col + 1]) && isVowel(arrayToSearchVowel[row + 1][col + 1]))
					return "FOUND!";
			}
		}

		return "NOT FOUND";
	}

	public static boolean isVowel(char input) {
		char[] vowels = { 'a', 'i', 'u', 'e', 'o' };

		for (char vowel : vowels) {
			if (vowel == input)
				return true;
		}

		return false;
	}

	public static int generateRandomintWithinRange(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(25) + 1;
	}
}