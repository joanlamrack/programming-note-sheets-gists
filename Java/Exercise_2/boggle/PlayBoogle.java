import java.util.Arrays;

public class PlayBoogle{
	public static void main(String[] args){
		BoggleBoard oneGameSession = new BoggleBoard();
		oneGameSession.shake(5);
		oneGameSession.printBoard();
		oneGameSession.solve();
	}
}