import java.io.IOException;
import java.util.HashMap;

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
		return (Character) integerInput + 'a';
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
			output[start][playerStats.get(player)] = player;
			start++;
		}

		return output;
	}
}