import java.util.Arrays;

public class sudokusolver {
	public static void main(String[] args) {
		String fromFile = doReadFile("set01-unsolved.txt");
		System.out.println(Arrays.toString( FileReader.separateByEnter(fromFile) ));
	}


}