public class PlayBoogle{
	public static void main(String[] args){
		BoogleBoard oneGameSession = new BoggleBoard();

		oneGameSession.shake(4);
		oneGameSession.printBoard();
	}
}