import java.util.ArrayList;
import java.util.Arrays;

public class StringToArray {
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(doStringToArray("sqrst,ukaei,ffooo")));
	}

	public static char[][] doStringToArray(String input) {
		ArrayList<char[]> output = new ArrayList<char[]>();
		String[] sections = input.split(",");
		for (String section : sections) {
			output.add(section.toCharArray());
		}

		return output.toArray( new char[sections.length][]);
	}
}