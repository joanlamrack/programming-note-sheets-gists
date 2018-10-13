public class playingwithasteriks {
	public static void main(String[] args) {
		PrintRowofStars(3);
		printRowAndColumn(3, 4);
		printStairs(4);
	}

	public static void PrintRowofStars(int rows) {
		for (int row = 0; row < rows; row++) {
			System.out.println("*");
		}
	}

	public static void printRowAndColumn(int rows, int columns) {
		for (int row = 0; row < rows; row++) {
			String buffer = "";
			for (int col = 0; col < columns; col++) {
				buffer += "*";
			}

			System.out.println(buffer);
		}
	}

	public static void printStairs(int stepsLevel) {
		for (int step = 0; step < stepsLevel; step++) {
			String buffer = "";
			for (int col = 0; col <= step; col++) {
				buffer += "*";
			}

			System.out.println(buffer);
		}
	}

}