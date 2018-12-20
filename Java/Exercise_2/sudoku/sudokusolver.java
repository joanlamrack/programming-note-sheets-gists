import java.nio.file.Files;

public class sudokusolver {
	public static void main(String[] args) {
		
	}

	public static String doReadFile(String fileName){
		return new String(Files.readAllBytes(Paths.get(fileName)))
	}
}