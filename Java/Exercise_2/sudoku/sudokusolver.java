import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class sudokusolver {
	public static void main(String[] args) {
		String fromFile = doReadFile("set01-unsolved.txt");
		System.out.println(Arrays.toString( separateByEnter(fromFile) ));
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
		return input.split("\\r?\\n", -1);
	}
}