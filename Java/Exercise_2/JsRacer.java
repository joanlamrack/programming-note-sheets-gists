import java.io.IOException;
import java.util.HashMap;

public class JsRacer{
	public static void main(String[]args){
		
	}

	public static void DoClearScreen(){
		try{
			ClearScreen();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void ClearScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}

	public static Character generateAlphabetFromInteger(int integerInput){
		return (char) (integerInput - 1) + 'a';
	}

	// public static HashMap<Character,Integer> playerList(int playerCount){
		
	// 	return
	// }
}