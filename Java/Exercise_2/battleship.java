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
}