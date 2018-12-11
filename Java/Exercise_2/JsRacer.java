import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class JsRacer {
	public static void main(String[] args) {

	}

	public static void DoClearScreen() {
		try {
			ClearScreen();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void ClearScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}

	public static Character generateAlphabetFromInteger(int integerInput) {
		return (char)(integerInput + 'a');
	}

	public static HashMap<Character, Integer> playerList(int playerCount) {
		HashMap<Character, Integer> output = new HashMap<Character, Integer>();

		for (int start = 0; start < playerCount; start++) {
			output.put(generateAlphabetFromInteger(start), 0);
		}

		return output;
	}

	public static char[][] generateBoard (HashMap<Character,Integer> playerStats, int trackLength){
		char[][] output= new char[ playerStats.size() ][ trackLength];
		int start = 0;
		for(Character player: playerStats.keySet()){
			Arrays.fill(output[start], ' ');
			output[start][playerStats.get(player)] = player;
			start++;
		}
		return output;
	}

	public static void printBoard (char[][] board){
		for(char[] playerLine : board){
			System.out.println( Arrays.toString(playerLine));
		}
	}

	public static int generateRandomintWithinRange(int max) {
		Random rand = new Random();
		return rand.nextInt(max) + 1;
	}
}