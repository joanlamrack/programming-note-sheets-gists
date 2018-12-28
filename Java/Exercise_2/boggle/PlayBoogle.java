import java.util.Arrays;

public class PlayBoogle{
	public static void main(String[] args){
		BoggleBoard oneGameSession = new BoggleBoard();
		oneGameSession.shake(5);
		oneGameSession.printBoard();
		System.out.println(  Arrays.toString(BoogleDirection.getDirections()) );
	}
}