public class biggestpairnumber {
	public static void main(String[] args) {
		System.out.println(dobiggestpairnumber(910233));
	}

	public static int dobiggestpairnumber(int input) {
		char[] convertedInput = Integer.toString(input).toCharArray();
		Integer max = null;

		for (int start = 0; start < convertedInput.length - 1; start++) {
			int current_number = Integer.parseInt(String.copyValueOf(convertedInput, start, 2));

			if (max == null) {
			max = current_number;
			} else if (max < current_number) {
			max = current_number;
			}
		}

		return max;
	}
}