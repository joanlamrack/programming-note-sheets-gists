import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
	public static String doReadFile(String fileName) {
		try {
			return new String(Files.readAllBytes(Paths.get(fileName)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String[] separateByEnter(String input) {
		return input.split("\\r?\\n", -1);
	}
}