import java.util.HashMap;

public class BattleshipGame {
	HashMap<Character, Integer> enemiesData = null;
	int boardLength = 0;
	int boardLastIndex = boardLength - 1;
	char[][] board = null;

	public BattleshipGame(HashMap<Character, Integer> enemiesData, int boardLength) {
		this.enemiesData = enemiesData;
		this.boardLength = boardLength;
		this.board = BattleshipBoard.generateBoardWithEnemies(enemiesData, boardLength);
	}

	public void takeShots(String[] shots){
		for(String shot: shots){
			takeShot(shot);
		}
	}

	public void takeShot(String shot){

	}

	public void printBoard(){
		BattleshipBoard.printBoard(this.board);
	}
}