import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] input = new int[] { 64, 25, 12, 22, 11 };

		System.out.println(Arrays.toString(doSelectionSort(input)));
	}

	public static int[] doSelectionSort(int[] input) {

		for (int start = 0; start < input.length; start++) {
			int tempIndex = start;
			int smallestNumber = input[start];
			for (int start2 = start; start2 < input.length; start2++) {
				if (smallestNumber > input[start2]) {
					tempIndex = start2;
					smallestNumber = input[start2];
				}
			}
			input[tempIndex] = input[start];
			input[start] = smallestNumber;

		}

		return input;
	}
}