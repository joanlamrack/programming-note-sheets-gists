import java.io.IOException;

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
}