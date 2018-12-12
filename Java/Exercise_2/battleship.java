import java.util.HashMap;

public class battleship{
	public static void main(String[]args){
		
	}

	public static void doSleep(){
		sleep(2000);
	}

	public static void sleep(int milliseconds){
		Thread.sleep(milliseconds);
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

	public static void generateBoard(){
		HashMap<Character,Integer> shipData = new HashMap<Character,Integer>();
		shipData.put('b', 4);
		shipData.put('c', 5);
		shipData.put('d', 2);


	}
}