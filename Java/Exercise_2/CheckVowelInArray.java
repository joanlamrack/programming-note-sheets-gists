import java.util.Random;

public class CheckVowelInArray{
	public static void main(String[]args){
		System.out.println(  generateRandomintWithinRange(1, 26) );
	}

	// public static char[][] generateRandomAlphabetArray(){

	// }

	public static String searchAlphabetBlock(char[][] arrayToSearchVowel){
		return "";
	}

	public static int generateRandomintWithinRange(int min, int max){
		Random rand = new Random();
		return rand.nextInt(25) + 1;
	}
}