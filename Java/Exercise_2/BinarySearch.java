import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] input = new int[] { 2, 6, 7, 9, 14, 20 };
		boolean result = doBinarySearch(input, 1);

		System.out.println(result);
	}

	public static boolean doBinarySearch(int[] input, int toSearch) {
		// assuming that object already sorted
		// search for middle array.
		int length = input.length;
		int middleIndex = 0;
		int middleElement = 0;
		if ((length % 2) == 0) {
			middleIndex = (length / 2) - 1;
		} else {
			middleIndex = (length - 1) / 2;
		}

		middleElement = input[middleIndex];
		if (input.length == 2) {
			return input[0] == toSearch || input[1] == toSearch;
		} else if (middleElement < toSearch) {
			return false || doBinarySearch(Arrays.copyOfRange(input, middleIndex, length), toSearch);
		} else if (middleElement > toSearch) {
			return false || doBinarySearch(Arrays.copyOfRange(input, 0, middleIndex), toSearch);
		}

		return false;
	}
}