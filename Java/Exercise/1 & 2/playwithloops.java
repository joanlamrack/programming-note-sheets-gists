public class playwithloops {
	public static void main(String[] args) {
		loopusingwhile();
		loopusingfor();
		OddAndEven();
		counterLooper(2);
		counterLooper(5);
		counterLooper(9);
	}

	public static void loopusingwhile() {
		int looper = 2;
		System.out.println("LOOPING PERTAMA");
		while (looper <= 20) {
			System.out.println(looper + " - I love coding");
			looper += 2;
		}

		looper = 20;
		System.out.println("LOOPING KEDUA");
		while (looper >= 0) {
			System.out.println(looper + "- I will become fullstack developer");
			looper -= 2;
		}

	}

	public static void loopusingfor() {

		System.out.println("LOOPING PERTAMA");
		for (int looper = 2; looper < 20; looper += 2) {
			System.out.println(looper + " - I love coding");
		}

		System.out.println("LOOPING KEDUA");
		for (int looper = 20; looper > 0; looper -= 2) {
			System.out.println(looper + "- I will become fullstack developer");
		}
	}

	public static void OddAndEven() {
		for (int looper = 1; looper < 100; looper++) {
			System.out.println(looper % 2 == 0 ? "GANJIL" : "GENAP");
		}
	}

	public static void counterLooper(int addition) {
		for (int looper = 1; looper < 100; looper++) {
			if (looper % addition == 0) {
				System.out.println(looper + " KELIPATAN " + addition);
			}
		}
	}
}