import java.nio.file.Files;
import java.nio.file.Path;

public class sudokusolver {
	public static void main(String[] args) {
		System.out.println( doReadFile("set01-unsolved.txt") );
	}

	public static String doReadFile(String fileName){
		return new String(Files.readAllBytes(Paths.get(fileName)));
	}
}