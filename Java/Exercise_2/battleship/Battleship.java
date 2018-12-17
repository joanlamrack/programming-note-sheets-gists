public class Battleship{
	public static void main(String[]args){
		HashMap<Character, Integer> enemiesData = new HashMap<Character, Integer>();
		enemiesData.put('b', 4);
		enemiesData.put('c', 5);
		enemiesData.put('d', 2);
		char[][] board =  BattleshipBoard.generateBoardWithEnemies(enemiesData);

		BattleshipBoard.printBoard(board);
	}
}