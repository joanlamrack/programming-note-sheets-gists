public class playingwithstring {
	public static void main(String[] args) {
		letsformsentence();
		onebyoneaccess();
		usingsubstring();
	}

	public static void letsformsentence() {
		String word = "JavaScript";
		String second = "is";
		String third = "awesome";
		String fourth = "and";
		String fifth = "I";
		String sixth = "love";
		String seventh = "it!";

		System.out
				.println(word + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " + seventh);
	}

	public static void onebyoneaccess() {
		String word = "wow JavaScript is so cool";

		String first = Character.toString(word.charAt(0)) + Character.toString(word.charAt(1))
				+ Character.toString(word.charAt(2));

		System.out.println(first);

	}

	public static void usingsubstring() {
		String word = "wow JavaScript is so cool";

		String first = word.substring(0, 3);
		String second = word.substring(4, 14);

		System.out.println(first + " " + second);
	}
}