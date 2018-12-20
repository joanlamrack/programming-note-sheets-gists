import java.nio.file.Files;
import java.nio.file.Paths;

public class sudokusolver {
	public static void main(String[] args) {
		System.out.println(doReadFile("set01-unsolved.txt"));
	}

	public static String doReadFile(String fileName) {
		try {
			return new String(Files.readAllBytes(Paths.get(fileName)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String[] separateByEnter(String input){
		return input.split(split("\\r?\\n", -1));
	}
}