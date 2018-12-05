import java.util.Arrays;

public class DictionarySort {
	public static void main(String[] args) {
		String[] input = { "makan", "duduk", "terbang", "tidur" };

		System.out.println(Arrays.toString(doDictionarySort(input)));
	}

	public static String[] doDictionarySort(String[] input) {
		Arrays.sort(input);
		return input;
	}
}