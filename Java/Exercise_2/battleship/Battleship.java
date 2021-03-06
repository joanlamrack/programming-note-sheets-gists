import java.util.HashMap;;

public class Battleship{
	public static void main(String[]args){
		HashMap<Character, Integer> enemiesData = new HashMap<Character, Integer>();
		enemiesData.put('b', 4);
		enemiesData.put('c', 5);
		enemiesData.put('d', 2);

		int boardLength = 10;

		BattleshipGame gameSession = new BattleshipGame(enemiesData, boardLength);
		gameSession.play( new String[] {"F10", "C7", "D8", "F1", "C5", "A3"});
	}
}