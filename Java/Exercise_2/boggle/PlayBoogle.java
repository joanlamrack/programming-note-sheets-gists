public class PlayBoogle{
	public static void main(String[] args){
		BoggleBoard oneGameSession = new BoggleBoard();
		oneGameSession.shake(4);
		oneGameSession.printBoard();
	}
}