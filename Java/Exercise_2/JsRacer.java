import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class JsRacer {
	public static void main(String[] args) {
		runJavaRacer(5, 8);
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
		return (char) (integerInput + 'a');
	}

	public static HashMap<Character, Integer> playerList(int playerCount) {
		HashMap<Character, Integer> output = new HashMap<Character, Integer>();

		for (int start = 0; start < playerCount; start++) {
			output.put(generateAlphabetFromInteger(start), 0);
		}

		return output;
	}

	public static char[][] generateBoard(HashMap<Character, Integer> playerStats, int trackLength) {
		char[][] output = new char[playerStats.size()][trackLength];
		int start = 0;
		for (Character player : playerStats.keySet()) {
			Arrays.fill(output[start], ' ');
			output[start][playerStats.get(player)] = player;
			start++;
		}
		return output;
	}

	public static void printBoard(char[][] board) {
		for (char[] playerLine : board) {
			System.out.println(Arrays.toString(playerLine));
		}
	}

	public static int generateRandomintWithinRange(int max) {
		Random rand = new Random();
		return rand.nextInt(max-3) + 1;
	}

	public static boolean isAtFinishLine(int playerPosition, int trackLength) {
		if (playerPosition >= (trackLength - 1)) {
			return true;
		}
		return false;
	}

	public static void runJavaRacer(int playerCount, int tracklength) {
		int minimumTrackLength = 5;
		int minimumPlayer = 2;
		boolean isEnding = false;

		if (playerCount <= minimumPlayer) {
			playerCount = minimumPlayer;
		}

		if (tracklength <= minimumTrackLength) {
			tracklength = minimumTrackLength;
		}

		HashMap<Character, Integer> playerData = playerList(playerCount);

		while (isEnding == false) {
			for (Character player : playerData.keySet()) {
				DoClearScreen();

				int playerPosition = playerData.get(player);
				int advanceSteps = generateRandomintWithinRange((tracklength - 1) - playerPosition);
				playerPosition = playerPosition + advanceSteps;
				playerData.put(player, playerPosition);

				char[][] board = generateBoard(playerData, tracklength);
				printBoard(board);
				if (isAtFinishLine(playerPosition, tracklength)) {
					System.out.println( player +" is the winner" );
					isEnding = true;
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}