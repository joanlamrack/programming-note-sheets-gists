public class palidromenumber {
	public static void main(String[] args) {
		System.out.println(palindromenumber(117));
	}

	public static int palindromenumber(int input) {
		do {
			input++;

		} while (dopalidrome(Integer.toString(input)) == false);
		return input;
	}

	public static boolean dopalidrome(String kata) {
		char[] tobeCompared = kata.toCharArray();
		for (int start = 0, end = kata.length() - 1; start < end; start++, end--) {
			if (tobeCompared[start] != tobeCompared[end]) {
				return false;
			}

		}

		return true;
	}
}