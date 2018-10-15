public class EnchancedLoop {
	public static void main(String[] args) {
		int[] arrNumber = { 12, 23, 43, 123, 67 };
		String[] arrName = { "James", "haha", "Gray", "Woi", "Bri" };

		for (int elementNum : arrNumber) {
			System.out.println(elementNum);
		}

		for (String elementStr : arrName) {
			System.out.println(elementStr);
		}
	}
}