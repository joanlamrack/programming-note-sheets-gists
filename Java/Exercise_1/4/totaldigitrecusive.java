public class totaldigitrecusive {
	public static void main(String[] args) {
		System.out.println(dototaldigitrecursive(512));
	}

	public static int dototaldigitrecursive(int number) {
		String numberString = Integer.toString(number);

		if (numberString.length() == 1) {
			return Integer.parseInt(numberString.substring(0, 1));
		} else {
			return Integer.parseInt(numberString.substring(0, 1)) + dototaldigitrecursive(Integer.parseInt(numberString.substring(1)));
		}

	}
}